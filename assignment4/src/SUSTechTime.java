public class SUSTechTime {
    private Weekday weekday;
    private WeekType weekType;
    private String startTime, endTime;

    SUSTechTime(String startTime, String endTime, Weekday weekday, WeekType weekType) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekday = weekday;
        this.weekType = weekType;
    }
    public String toString() { return "SUSTechTime{" + startTime + " ~ " + endTime + " | " + weekday + " | " + weekType + " week}"; }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public WeekType getWeekType() {
        return weekType;
    }
}
enum WeekType {Odd, Even, Every}
