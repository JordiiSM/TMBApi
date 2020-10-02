import java.util.Arrays;

public class LocationWrapper {
    private String name;
    private double[] coordinates;
    private String description;
    private String architect;
    private Integer inauguration;
    private String[] characteristics;
    private Integer stars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public Integer getInauguration() {
        return inauguration;
    }

    public void setInauguration(Integer inauguration) {
        this.inauguration = inauguration;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "LocationJson{" +
                "name='" + name + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                ", description='" + description + '\'' +
                ", architect='" + architect + '\'' +
                ", inauguration=" + inauguration +
                ", characteristics='" + characteristics + '\'' +
                ", stars=" + stars +
                '}';
    }
}
