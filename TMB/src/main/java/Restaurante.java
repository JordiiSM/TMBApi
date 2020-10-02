import java.util.Arrays;

public class Restaurante extends Location {
    private String[] characteristics;

    public Restaurante(String name, double[] coordinates, String description, String[] characteristics) {
        super(name, coordinates, description);
        this.characteristics = characteristics;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "characteristics=" + Arrays.toString(characteristics) +
                '}';
    }
}
