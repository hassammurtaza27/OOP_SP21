public class Computer
{
    private int wordSize, memorySize, storageSize;
    private double speed;

    public Computer()
    {
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    public Computer(int wordSize,int  memorySize, int storageSize, double speed)
    {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String display()
    {
        return "Word Size: " + wordSize + " bits" +
                "\nMemory Size: " + memorySize + " Mega Bytes" +
                "\nStorage Size: " + storageSize + " Mega Bytes" +
                "\nSpeed: " + speed + " Mega Hertz";
    }
}
