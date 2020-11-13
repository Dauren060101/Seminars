import java.io.File;

public class Class {
    private String spacing = "";

    public int getInformation(File file) {

        if (file == null) {
            System.out.println("END");
            return 0;
        }

        if (!file.getName().equals("")) {
            System.out.println(spacing + "Name: " + file.getName() + "\"\\u2193\"");
        } else {
            System.out.println(spacing + "Main Directory");
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            if (files.length != 1) {
                System.out.println(spacing + file.getName() + " Contains:");
                for (File i : files) {
                    System.out.println(spacing + "\t|" + i.getName());
                }

            }
            spacing += "\t";
        }
        file = file.getParentFile();
        return getInformation(file);
    }
}
