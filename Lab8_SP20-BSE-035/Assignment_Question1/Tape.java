public class Tape extends Publications
{
    private int playingMinutes;

    public Tape(String title, double price, int pM)
    {
        super(title, price);
        playingMinutes = pM;
    }

    public int getPlayingMinutes() {
        return playingMinutes;
    }

    public void setPlayingMinutes(int playingMinutes) {
        this.playingMinutes = playingMinutes;
    }

    public String display()
    {
        return super.display() +
                "\nPlaying Minutes: " + playingMinutes;
    }
}
