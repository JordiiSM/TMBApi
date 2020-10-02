import java.util.ArrayList;
import java.util.List;
class Paso{
    private String modo;
    private String linea;
    private long legDuration;
    private String from;
    private String to;

    public Paso(String modo, String linea, long legDuration, String from, String to) {
        this.modo = modo;
        this.linea = linea;
        this.legDuration = legDuration;
        this.from = from;
        this.to = to;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public long getLegDuration() {
        return legDuration;
    }

    public void setLegDuration(long legDuration) {
        this.legDuration = legDuration;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Paso{" +
                "modo='" + modo + '\'' +
                ", linea='" + linea + '\'' +
                ", legDuration=" + legDuration +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
public class Ruta {
    private long duration;
    private List <Paso> pasos;


    public Ruta() {
        pasos = new ArrayList<>();
    }

    public Ruta(long duration, List<Paso> pasos) {
        this.duration = duration;
        this.pasos = pasos;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "duration=" + duration +
                ", pasos=" + pasos +
                '}';
    }

    public void añadirPaso(Paso paso){
        this.pasos.add(paso);
    }
}
