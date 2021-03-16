public class HotDogStand
{
    private String idNum;
    private int sold;

    HotDogStand(String id, int sold)
    {
        idNum = id;
        this.sold = sold;
    }

    void justSold()
    {
        sold++;
    }

    int getSold()
    {
        return sold;
    }

    String getIdNum()
    {
        return idNum;
    }
}
