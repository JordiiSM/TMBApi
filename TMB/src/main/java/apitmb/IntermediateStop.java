
package apitmb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IntermediateStop {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stopId")
    @Expose
    private String stopId;
    @SerializedName("stopCode")
    @Expose
    private String stopCode;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("arrival")
    @Expose
    private Long arrival;
    @SerializedName("departure")
    @Expose
    private Long departure;
    @SerializedName("stopIndex")
    @Expose
    private Long stopIndex;
    @SerializedName("stopSequence")
    @Expose
    private Long stopSequence;
    @SerializedName("vertexType")
    @Expose
    private String vertexType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Long getArrival() {
        return arrival;
    }

    public void setArrival(Long arrival) {
        this.arrival = arrival;
    }

    public Long getDeparture() {
        return departure;
    }

    public void setDeparture(Long departure) {
        this.departure = departure;
    }

    public Long getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(Long stopIndex) {
        this.stopIndex = stopIndex;
    }

    public Long getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Long stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getVertexType() {
        return vertexType;
    }

    public void setVertexType(String vertexType) {
        this.vertexType = vertexType;
    }

}
