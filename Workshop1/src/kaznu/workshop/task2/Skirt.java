package kaznu.workshop.task2;

public class Skirt extends Clothes implements  WomenClothing{
    public Skirt(Size size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина была одета в юбку");
    }
}
