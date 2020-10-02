
package apitmb;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leg {

    @SerializedName("startTime")
    @Expose
    private Long startTime;
    @SerializedName("endTime")
    @Expose
    private Long endTime;
    @SerializedName("departureDelay")
    @Expose
    private Long departureDelay;
    @SerializedName("arrivalDelay")
    @Expose
    private Long arrivalDelay;
    @SerializedName("realTime")
    @Expose
    private Boolean realTime;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("pathway")
    @Expose
    private Boolean pathway;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("route")
    @Expose
    private String route;
    @SerializedName("agencyTimeZoneOffset")
    @Expose
    private Long agencyTimeZoneOffset;
    @SerializedName("interlineWithPreviousLeg")
    @Expose
    private Boolean interlineWithPreviousLeg;
    @SerializedName("from")
    @Expose
    private From_ from;
    @SerializedName("to")
    @Expose
    private To_ to;
    @SerializedName("legGeometry")
    @Expose
    private LegGeometry legGeometry;
    @SerializedName("rentedBike")
    @Expose
    private Boolean rentedBike;
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("transitLeg")
    @Expose
    private Boolean transitLeg;
    @SerializedName("intermediateStops")
    @Expose
    private List<IntermediateStop> intermediateStops = null;
    @SerializedName("steps")
    @Expose
    private List<Step> steps = null;
    @SerializedName("agencyName")
    @Expose
    private String agencyName;
    @SerializedName("agencyUrl")
    @Expose
    private String agencyUrl;
    @SerializedName("routeColor")
    @Expose
    private String routeColor;
    @SerializedName("routeType")
    @Expose
    private Long routeType;
    @SerializedName("routeId")
    @Expose
    private String routeId;
    @SerializedName("routeTextColor")
    @Expose
    private String routeTextColor;
    @SerializedName("headsign")
    @Expose
    private String headsign;
    @SerializedName("agencyId")
    @Expose
    private String agencyId;
    @SerializedName("tripId")
    @Expose
    private String tripId;
    @SerializedName("serviceDate")
    @Expose
    private String serviceDate;
    @SerializedName("routeShortName")
    @Expose
    private String routeShortName;
    @SerializedName("routeLongName")
    @Expose
    private String routeLongName;

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

    public Long getDepartureDelay() {
        return departureDelay;
    }

    public void setDepartureDelay(Long departureDelay) {
        this.departureDelay = departureDelay;
    }

    public Long getArrivalDelay() {
        return arrivalDelay;
    }

    public void setArrivalDelay(Long arrivalDelay) {
        this.arrivalDelay = arrivalDelay;
    }

    public Boolean getRealTime() {
        return realTime;
    }

    public void setRealTime(Boolean realTime) {
        this.realTime = realTime;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Boolean getPathway() {
        return pathway;
    }

    public void setPathway(Boolean pathway) {
        this.pathway = pathway;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Long getAgencyTimeZoneOffset() {
        return agencyTimeZoneOffset;
    }

    public void setAgencyTimeZoneOffset(Long agencyTimeZoneOffset) {
        this.agencyTimeZoneOffset = agencyTimeZoneOffset;
    }

    public Boolean getInterlineWithPreviousLeg() {
        return interlineWithPreviousLeg;
    }

    public void setInterlineWithPreviousLeg(Boolean interlineWithPreviousLeg) {
        this.interlineWithPreviousLeg = interlineWithPreviousLeg;
    }

    public From_ getFrom() {
        return from;
    }

    public void setFrom(From_ from) {
        this.from = from;
    }

    public To_ getTo() {
        return to;
    }

    public void setTo(To_ to) {
        this.to = to;
    }

    public LegGeometry getLegGeometry() {
        return legGeometry;
    }

    public void setLegGeometry(LegGeometry legGeometry) {
        this.legGeometry = legGeometry;
    }

    public Boolean getRentedBike() {
        return rentedBike;
    }

    public void setRentedBike(Boolean rentedBike) {
        this.rentedBike = rentedBike;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Boolean getTransitLeg() {
        return transitLeg;
    }

    public void setTransitLeg(Boolean transitLeg) {
        this.transitLeg = transitLeg;
    }

    public List<IntermediateStop> getIntermediateStops() {
        return intermediateStops;
    }

    public void setIntermediateStops(List<IntermediateStop> intermediateStops) {
        this.intermediateStops = intermediateStops;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyUrl() {
        return agencyUrl;
    }

    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
    }

    public String getRouteColor() {
        return routeColor;
    }

    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    public Long getRouteType() {
        return routeType;
    }

    public void setRouteType(Long routeType) {
        this.routeType = routeType;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteTextColor() {
        return routeTextColor;
    }

    public void setRouteTextColor(String routeTextColor) {
        this.routeTextColor = routeTextColor;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public String getRouteLongName() {
        return routeLongName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

}
