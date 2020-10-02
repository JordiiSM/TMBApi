import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private List <LocationWrapper> locations;

    public List<LocationWrapper> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationWrapper> locations) {
        this.locations = locations;
    }

    public DataModel structureJson() {
        int option = 0;
        Gson gson = new Gson();
        DataModel locations = new DataModel();

        try {
            // 1. JSON file to Java object
            locations = gson.
                    fromJson(new FileReader("src/main/resources/locations.json"),
                            DataModel.class);
            List<Location> locationList = new ArrayList<>();


            for (LocationWrapper locationWrapper : locations.getLocations()) {
                if (locationWrapper.getCharacteristics() != null) { //Restaurant
                    Restaurante restaurante = new Restaurante(
                            locationWrapper.getName(),
                            locationWrapper.getCoordinates(),
                            locationWrapper.getDescription(),
                            locationWrapper.getCharacteristics()
                    );
                    locationList.add(restaurante);
                } else if (locationWrapper.getStars() != null) { //Hotel
                    Hotel hotel = new Hotel(
                            locationWrapper.getName(),
                            locationWrapper.getCoordinates(),
                            locationWrapper.getDescription(),
                            locationWrapper.getStars()
                    );
                } else if (locationWrapper.getInauguration() != null) { //Museo
                    Museo museo = new Museo(
                            locationWrapper.getName(),
                            locationWrapper.getCoordinates(),
                            locationWrapper.getDescription(),
                            locationWrapper.getArchitect(),
                            locationWrapper.getInauguration()

                    );
                } else {
                    Location location = new Location(
                            locationWrapper.getName(),
                            locationWrapper.getCoordinates(),
                            locationWrapper.getDescription()
                    );
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return locations;
    }
    public void locationNameToString(String name, DataModel locations){
        System.out.println(locations.locations.size());
        for (int i = 0;i<locations.locations.size();i++){
            if(locations.locations.get(i).getName().equals(name)){
                System.out.println("Posició: "+locations.locations.get(i).getCoordinates()[0]+","+locations.locations.get(i).getCoordinates()[1]);
                System.out.println("Descripció:");
                System.out.println(locations.locations.get(i).getDescription());
            }
        }
    }

    public double[] getCoord(String name,DataModel locations){
        for (int i = 0;i<locations.locations.size();i++){
            if(locations.locations.get(i).getName().equals(name)){
                return locations.locations.get(i).getCoordinates();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "JsonLocations{" +
                "locations=" + locations +
                '}';
    }
}
