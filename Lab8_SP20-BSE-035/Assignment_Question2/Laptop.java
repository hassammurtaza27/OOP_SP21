public class Laptop extends Computer
{
    private int length, width, height, weight;

    public Laptop()
    {
        super();
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }

    public Laptop(int wordSize,int  memorySize, int storageSize, double speed,
                  int length, int width, int height, int weight)
    {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.weight = weight;
        this.height = height;
        this.weight = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String display()
    {
        return super.display() +
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nWeight: " + weight;
    }
}
