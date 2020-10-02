import java.util.List;

public class Parada {
    private List<Autobus> autobuses;

    public Parada(List<Autobus> autobuses) {
        this.autobuses = autobuses;
    }

    public Parada() {
    }

    public List<Autobus> getAutobuses() {
        return autobuses;
    }

    public void setAutobuses(List<Autobus> autobuses) {
        this.autobuses = autobuses;
    }

    public void añadirBus(Autobus autobus){
        this.autobuses.add(autobus);
    }
}
class Autobus{
    private String linea;
    private String destino;
    private long minutes;

    public Autobus(String linea, String destino, long minutes) {
        this.linea = linea;
        this.destino = destino;
        this.minutes = minutes;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

}
