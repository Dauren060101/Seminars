package kaznu.workshop.task2;

public class Pants extends Clothes implements MenClothing {
    public Pants(Size size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина был одет в штаны");
    }

}
