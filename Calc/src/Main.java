import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        calculator.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        calculator.setSize(1000, 500);
        calculator.setVisible(true);
    }
}
