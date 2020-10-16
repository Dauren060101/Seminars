package kaznu.workshop.task2;

public abstract class Clothes {
    private Size size;
    private double price;
    private String colour;

    public Clothes(Size size,double price,String colour) {
        this.colour = colour;
        this.price = price;
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

}
