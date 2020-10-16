package kaznu.workshop.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина был одет в галстук");
    }
}
