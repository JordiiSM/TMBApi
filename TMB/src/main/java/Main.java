import apitmb.Route;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//API
//14d5ca85
//1365a2140659e91e6495b13db2e39abc

public class Main {
    public static void main(String[] args) throws IOException {

            Sistema sistema = new Sistema();
            sistema.System();
        String coord1 = "41.3755204,2.1498870";
        String coord2 = "41.422520,2.187824";


//        ApiRequest apiReq = new ApiRequest();
//        Ruta ruta = apiReq.planejarRuta(coord1,coord2);
//        System.out.println(ruta);


    }
}

