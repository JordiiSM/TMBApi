
package ibus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ibu {

    @SerializedName("routeId")
    @Expose
    private String routeId;
    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("text-ca")
    @Expose
    private String textCa;
    @SerializedName("t-in-s")
    @Expose
    private Long tInS;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("t-in-min")
    @Expose
    private Long tInMin;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getTextCa() {
        return textCa;
    }

    public void setTextCa(String textCa) {
        this.textCa = textCa;
    }

    public Long getTInS() {
        return tInS;
    }

    public void setTInS(Long tInS) {
        this.tInS = tInS;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getTInMin() {
        return tInMin;
    }

    public void setTInMin(Long tInMin) {
        this.tInMin = tInMin;
    }

}
