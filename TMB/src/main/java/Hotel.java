public class Hotel extends Location{
    private Integer stars;

    public Hotel(String name, double[] coordinates, String description, Integer stars) {
        super(name, coordinates, description);
        this.stars = stars;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "stars=" + stars +
                '}';
    }
}
