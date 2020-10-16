package kaznu.workshop.task1;

public class Trumpet implements Instrument {
    private double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром:"+getDiameter());
    }

    public double getDiameter() {
        return diameter;
    }
}
