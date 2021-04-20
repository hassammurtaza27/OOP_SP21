public class Laptop_Runner
{
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setHeight(5);
        laptop.setLength(15);
        laptop.setWeight(100);
        laptop.setWidth(15);

        laptop.setSpeed(2.4);
        laptop.setMemorySize(1000);
        laptop.setStorageSize(200000);
        laptop.setWordSize(64);

        System.out.println(laptop.display());
    }
}
