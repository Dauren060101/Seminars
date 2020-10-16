package kaznu.workshop.task1;

public  class Drum implements Instrument {
    private double size;
    public Drum(double size){
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером:"+getSize());
    }

    public double getSize() {
        return size;
    }
}
