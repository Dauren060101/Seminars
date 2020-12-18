
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/***
 * TODO: special task description
 * После того как вы выполните простые TODO.
 * Сейчас калькулятор считает только одну операцию над двумя числами.
 * Попробуйте переделать программу так, чтоб можно было проделать несколько операций.
 * Например, чтоб можно было написать 4 + 2 * 5
 */
public class Calculator extends JFrame {


    private final JTextField jtfResult;


    public Calculator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        JButton button0 = new JButton("0");
        //TODO: create buttons for 1-9
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonClear = new JButton("C");
        //TODO: add buttons from 1-9 to JPanel

        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonClear);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        //TODO: add JButtons for operations +, -, *, /, =. And add them to corresponding JPanel
        JButton addition = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        JButton result = new JButton("=");
        p3.add(addition);
        p3.add(subtraction);
        p3.add(multiplication);
        p3.add(division);
        p3.add(result);


        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p1,BorderLayout.EAST);
        p.add(p2,BorderLayout.NORTH);
        p.add(p3,BorderLayout.WEST);
        //TODO: Add p1, p2, p3 panels in corresponding order
        //TODO: At the first place there should be text, then numbers, then operations
        //TODO: Use BorderLayout during p.add(panel, BorderLayout)

        add(p);

        //TODO: add actionListener to buttons 1-9 !
        button0.addActionListener(new ListenToZero());
        button1.addActionListener(new ListenToOne());
        button2.addActionListener(new ListenToTwo());
        button3.addActionListener(new ListenToThree());
        button4.addActionListener(new ListenToFour());
        button5.addActionListener(new ListenToFive());
        button6.addActionListener(new ListenToSix());
        button7.addActionListener(new ListenToSeven());
        button8.addActionListener(new ListenToEight());
        button9.addActionListener(new ListenToNine());


        //TODO: add actionListener to operations
        addition.addActionListener(new ListenToAdd());
        subtraction.addActionListener(new ListenToSubtract());
        division.addActionListener(new ListenToDivide());
        multiplication.addActionListener(new ListenToMultiply());
        buttonClear.addActionListener(new ListenToClear());
        result.addActionListener(new ListenToSolve());
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText("");

        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jtfResult.setText(jtfResult.getText() + "+");//TODO: special task

        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jtfResult.setText(jtfResult.getText() + "-");

        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jtfResult.setText(jtfResult.getText() + "*");

        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jtfResult.setText(jtfResult.getText() + "/");

        }
    }

    //TODO: special task
    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String exp = jtfResult.getText();
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            try {
                System.out.println(engine.eval(exp));
                jtfResult.setText(engine.eval((exp)).toString());
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }


        }
    }
}
