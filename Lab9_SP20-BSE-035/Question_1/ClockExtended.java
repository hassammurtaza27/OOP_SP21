public class ClockExtended extends Clock
{
    public ClockExtended(int hour, int minutes, int seconds)
    {
        super(hour, minutes, seconds);
    }

    @Override
    public void display()
    {
        if (super.hour >= 12 && super.minutes <= 59)
            System.out.println(hour + ":" + minutes + ":" + seconds + " PM");
        else
            System.out.println(hour + ":" + minutes + ":" + seconds + " AM");
    }
}
