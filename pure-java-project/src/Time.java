public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time setHour(int hour) {
        this.hour = hour;
        return this;
    }

    public Time setMinute(int minute) {
        this.minute = minute;
        return this;
    }

    public Time setSecond(int second) {
        this.second = second;
        return this;
    }

    @Override
    public String toString() {
        int displayHour = (hour == 12 || hour == 0) ? 12 : hour % 12;
        String amPm = (hour < 12) ? " AM" : " PM";
        String minuteStr = (minute < 10 ? "0" : "") + minute;
        String secondStr = (second < 10 ? "0" : "") + second;

        return displayHour + ":" + minuteStr + ":" + secondStr + amPm;
    }
}
