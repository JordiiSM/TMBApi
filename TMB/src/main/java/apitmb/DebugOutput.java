
package apitmb;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DebugOutput {

    @SerializedName("precalculationTime")
    @Expose
    private Long precalculationTime;
    @SerializedName("pathCalculationTime")
    @Expose
    private Long pathCalculationTime;
    @SerializedName("pathTimes")
    @Expose
    private List<Long> pathTimes = null;
    @SerializedName("renderingTime")
    @Expose
    private Long renderingTime;
    @SerializedName("totalTime")
    @Expose
    private Long totalTime;
    @SerializedName("timedOut")
    @Expose
    private Boolean timedOut;

    public Long getPrecalculationTime() {
        return precalculationTime;
    }

    public void setPrecalculationTime(Long precalculationTime) {
        this.precalculationTime = precalculationTime;
    }

    public Long getPathCalculationTime() {
        return pathCalculationTime;
    }

    public void setPathCalculationTime(Long pathCalculationTime) {
        this.pathCalculationTime = pathCalculationTime;
    }

    public List<Long> getPathTimes() {
        return pathTimes;
    }

    public void setPathTimes(List<Long> pathTimes) {
        this.pathTimes = pathTimes;
    }

    public Long getRenderingTime() {
        return renderingTime;
    }

    public void setRenderingTime(Long renderingTime) {
        this.renderingTime = renderingTime;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public Boolean getTimedOut() {
        return timedOut;
    }

    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

}
