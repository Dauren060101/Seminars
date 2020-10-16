package kaznu.workshop.task2;

public class Tshirt  extends Clothes implements WomenClothing,MenClothing{
    @Override
    public void dressMan() {
        System.out.println("Мужчина был одет в футболку");
    }
    public void dressWoman() {
        System.out.println("Женщина была одета в футболку");
    }
    public Tshirt(Size size,double price,String colour){
        super(size,price,colour);
    }
}
