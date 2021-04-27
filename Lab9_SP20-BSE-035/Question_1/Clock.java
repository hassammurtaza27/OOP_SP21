public class Clock
{
    protected int hour, minutes, seconds;

    public Clock(int hour, int minutes, int seconds)
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock()
    {
        hour = minutes = seconds = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display()
    {
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
