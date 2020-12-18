import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DivideAndConquer {

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame) {
        JPanel panel = new JPanel();
        LayoutManager layout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(layout);

        JButton button = new JButton("Choose");
        final JLabel sorted = new JLabel();
        final JLabel fileText = new JLabel();
        fileText.setHorizontalAlignment(SwingConstants.CENTER);
        final JLabel text1 = new JLabel("File Content:");
        final JLabel text2 = new JLabel("Sorted File Content:");
        Font f = new Font("serif", Font.PLAIN, 16);
        sorted.setFont(f);
        fileText.setFont(f);
        text1.setFont(f);
        text2.setFont(f);
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String fileContent = readFile(file.getAbsolutePath());
                fileText.setText(fileContent);
                String[] array = fileContent.split(",");


                sorted.setText(sort(array));

            } else {
                sorted.setText("Open command canceled");
            }
        });
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        panel.add(text1);
        panel.add(fileText);
        panel.add(text2);
        panel.add(sorted);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    private static String readFile(String fileName) {
        final StringBuilder builder = new StringBuilder();
        char[] array = new char[50];
        File file = new File(fileName);
        try (FileReader fr = new FileReader(file)) {
            int size = fr.read(array);
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]);
                builder.append(array[i]);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        return builder.toString();
    }

    static String sort(String[] arr) {
        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        return Arrays.toString(array).substring(1, Arrays.toString(array).length() - 1);
    }

}
