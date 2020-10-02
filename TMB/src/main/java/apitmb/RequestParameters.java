
package apitmb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestParameters {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("walkSpeed")
    @Expose
    private String walkSpeed;
    @SerializedName("walkReluctance")
    @Expose
    private String walkReluctance;
    @SerializedName("softWalkOverageRate")
    @Expose
    private String softWalkOverageRate;
    @SerializedName("fromPlace")
    @Expose
    private String fromPlace;
    @SerializedName("maxHours")
    @Expose
    private String maxHours;
    @SerializedName("softWalkPenalty")
    @Expose
    private String softWalkPenalty;
    @SerializedName("transferPenalty")
    @Expose
    private String transferPenalty;
    @SerializedName("waitReluctance")
    @Expose
    private String waitReluctance;
    @SerializedName("maxWalkDistance")
    @Expose
    private String maxWalkDistance;
    @SerializedName("maxTransfers")
    @Expose
    private String maxTransfers;
    @SerializedName("numItineraries")
    @Expose
    private String numItineraries;
    @SerializedName("waitAtBeginningFactor")
    @Expose
    private String waitAtBeginningFactor;
    @SerializedName("preferredAgencies")
    @Expose
    private String preferredAgencies;
    @SerializedName("walkBoardCost")
    @Expose
    private String walkBoardCost;
    @SerializedName("toPlace")
    @Expose
    private String toPlace;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("maxTransferWalkDistance")
    @Expose
    private String maxTransferWalkDistance;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(String walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public String getWalkReluctance() {
        return walkReluctance;
    }

    public void setWalkReluctance(String walkReluctance) {
        this.walkReluctance = walkReluctance;
    }

    public String getSoftWalkOverageRate() {
        return softWalkOverageRate;
    }

    public void setSoftWalkOverageRate(String softWalkOverageRate) {
        this.softWalkOverageRate = softWalkOverageRate;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(String maxHours) {
        this.maxHours = maxHours;
    }

    public String getSoftWalkPenalty() {
        return softWalkPenalty;
    }

    public void setSoftWalkPenalty(String softWalkPenalty) {
        this.softWalkPenalty = softWalkPenalty;
    }

    public String getTransferPenalty() {
        return transferPenalty;
    }

    public void setTransferPenalty(String transferPenalty) {
        this.transferPenalty = transferPenalty;
    }

    public String getWaitReluctance() {
        return waitReluctance;
    }

    public void setWaitReluctance(String waitReluctance) {
        this.waitReluctance = waitReluctance;
    }

    public String getMaxWalkDistance() {
        return maxWalkDistance;
    }

    public void setMaxWalkDistance(String maxWalkDistance) {
        this.maxWalkDistance = maxWalkDistance;
    }

    public String getMaxTransfers() {
        return maxTransfers;
    }

    public void setMaxTransfers(String maxTransfers) {
        this.maxTransfers = maxTransfers;
    }

    public String getNumItineraries() {
        return numItineraries;
    }

    public void setNumItineraries(String numItineraries) {
        this.numItineraries = numItineraries;
    }

    public String getWaitAtBeginningFactor() {
        return waitAtBeginningFactor;
    }

    public void setWaitAtBeginningFactor(String waitAtBeginningFactor) {
        this.waitAtBeginningFactor = waitAtBeginningFactor;
    }

    public String getPreferredAgencies() {
        return preferredAgencies;
    }

    public void setPreferredAgencies(String preferredAgencies) {
        this.preferredAgencies = preferredAgencies;
    }

    public String getWalkBoardCost() {
        return walkBoardCost;
    }

    public void setWalkBoardCost(String walkBoardCost) {
        this.walkBoardCost = walkBoardCost;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMaxTransferWalkDistance() {
        return maxTransferWalkDistance;
    }

    public void setMaxTransferWalkDistance(String maxTransferWalkDistance) {
        this.maxTransferWalkDistance = maxTransferWalkDistance;
    }

}
