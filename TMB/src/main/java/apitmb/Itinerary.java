
package apitmb;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Itinerary {

    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("startTime")
    @Expose
    private Long startTime;
    @SerializedName("endTime")
    @Expose
    private Long endTime;
    @SerializedName("walkTime")
    @Expose
    private Long walkTime;
    @SerializedName("transitTime")
    @Expose
    private Long transitTime;
    @SerializedName("waitingTime")
    @Expose
    private Long waitingTime;
    @SerializedName("walkDistance")
    @Expose
    private Double walkDistance;
    @SerializedName("walkLimitExceeded")
    @Expose
    private Boolean walkLimitExceeded;
    @SerializedName("elevationLost")
    @Expose
    private Long elevationLost;
    @SerializedName("elevationGained")
    @Expose
    private Long elevationGained;
    @SerializedName("transfers")
    @Expose
    private Long transfers;
    @SerializedName("legs")
    @Expose
    private List<Leg> legs = null;
    @SerializedName("tooSloped")
    @Expose
    private Boolean tooSloped;

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getWalkTime() {
        return walkTime;
    }

    public void setWalkTime(Long walkTime) {
        this.walkTime = walkTime;
    }

    public Long getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(Long transitTime) {
        this.transitTime = transitTime;
    }

    public Long getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Double getWalkDistance() {
        return walkDistance;
    }

    public void setWalkDistance(Double walkDistance) {
        this.walkDistance = walkDistance;
    }

    public Boolean getWalkLimitExceeded() {
        return walkLimitExceeded;
    }

    public void setWalkLimitExceeded(Boolean walkLimitExceeded) {
        this.walkLimitExceeded = walkLimitExceeded;
    }

    public Long getElevationLost() {
        return elevationLost;
    }

    public void setElevationLost(Long elevationLost) {
        this.elevationLost = elevationLost;
    }

    public Long getElevationGained() {
        return elevationGained;
    }

    public void setElevationGained(Long elevationGained) {
        this.elevationGained = elevationGained;
    }

    public Long getTransfers() {
        return transfers;
    }

    public void setTransfers(Long transfers) {
        this.transfers = transfers;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public Boolean getTooSloped() {
        return tooSloped;
    }

    public void setTooSloped(Boolean tooSloped) {
        this.tooSloped = tooSloped;
    }

}
