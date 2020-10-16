package kaznu.workshop.task1;

public class Guitar implements Instrument{
    private int stringAmount;

    public Guitar(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн:"+getStringAmount());
    }

    public int getStringAmount() {
        return stringAmount;
    }
}
