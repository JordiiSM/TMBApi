import apitmb.Itinerary;
import apitmb.Route;
import com.google.gson.Gson;
import ibus.Bus;
import ibus.Data;
import ibus.Ibu;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiRequest {

    private OkHttpClient okHttpClient = new OkHttpClient();
    private String url = "https://api.tmb.cat/v1/";
    private String urlRequest;
    private String urlApi = "app_id=14d5ca85&app_key=1365a2140659e91e6495b13db2e39abc";

    public Ruta planejarRuta(String coordenadaInicio, String coordenadaFin, String data, String hora,  String sortidaArribada, int distancia){
//        Request = new Request.Builder().url(baseUrl + "planner/plan?app_id=" + appId+"&app_key=" + appKey + "fromPlace="+ origin+ "&toPlace=" + destination);
        Request request = new Request.Builder().url(url+"planner/plan?"+urlApi+"&fromPlace="+coordenadaInicio+"&toPlace="+coordenadaFin+"&date="+data+"&time="+hora+"&arrivedBy="+sortidaArribada+"&maxWalkDistance="+distancia).build();
//        String parametres = "fromPlace="+String.valueOf(coordenada0[0])+","+String.valueOf(coordenada0[1]).toString+"toPlace"+coordenada1.toString;
//        Request request = new Request.Builder().url(url+"planner/plan?"+urlApi+"&fromPlace="+"41.3755204,2.1498870"+"&toPlace="+"41.422520,2.187824").build();

        try{
            Response response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()) {
                String responseBody = response.body().string();
                //Corte
                Gson gson = new Gson();
                Route route = gson.fromJson(responseBody, Route.class);
                Itinerary itinerary = route.getPlan().getItineraries().get(0);

                long duration = itinerary.getDuration();

                Ruta ruta = new Ruta();
                ruta.setDuration(duration);
                itinerary.getLegs().forEach(leg -> {
                    String modo = leg.getMode();
                    String linea = leg.getRoute();
                    long legDuration = leg.getDuration();
                    TimeUnit.SECONDS.toMinutes(legDuration);
                    String from = leg.getFrom().getName();
                    String to = leg.getTo().getName();
//
                    Paso paso = new Paso(modo,linea,legDuration,from,to);
                    ruta.añadirPaso(paso);
                });
                return ruta;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public void calcularEsperaBus(int codiparada){
        Request request = new Request.Builder().url(url+"ibus/stops/"+codiparada+"?"+urlApi).build();
        try{
            Response response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()) {
                String responseBody = response.body().string();
                Gson gson = new Gson();
                Bus bus = gson.fromJson(responseBody, Bus.class);
                Data data = bus.getData();
                Parada parada = new Parada();
                data.getIbus().forEach(ibu -> {
                    System.out.println(ibu.getLine()+" - "+ibu.getDestination()+" - "+ibu.getTInMin()+" min");
                });
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

