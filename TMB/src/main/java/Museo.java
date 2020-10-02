public class Museo extends Location {
    private String architect;
    private Integer inauguration;

    public Museo(String name, double[] coordinates, String description, String architect, Integer inauguration) {
        super(name, coordinates, description);
        this.architect = architect;
        this.inauguration = inauguration;
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

    @Override
    public String toString() {
        return "Museo{" +
                "architect='" + architect + '\'' +
                ", inauguration=" + inauguration +
                '}';
    }
}
