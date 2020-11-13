import java.io.* ;
class Main {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("myFile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("Что-то");

        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }
}