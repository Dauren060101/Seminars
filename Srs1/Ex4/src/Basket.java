import java.io.*;

/**
 * в) Создать класс Basket, содержащий массив купленных товаров.
 */
public class Basket implements Serializable {
    Product[] products = new Product[100];
    int amount = 0;

    public void add(Product pro) {//добавления товара в корзину
        products[amount] = pro;
        amount++;
    }

    public void show() {//метод метод для показа товаров в корзине
        if (amount == 0) {
            System.out.println("Корзина пуста");
        } else {
            for (int i = 0; i < amount; i++) {
                System.out.println("Имя товара:" + products[i].name);
                System.out.println("Цена товара:" + products[i].price);
                System.out.println("Рейтинг товара:" + products[i].rating);
                System.out.println("------------------------------------");
            }
        }
    }

    public void serialize(){
        try(FileOutputStream fs = new FileOutputStream("C:\\YITP\\Srs1\\Ex4\\basketSer.ser");) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            for(Product product:products){
                os.writeObject(product);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deSerialize(){
        try(FileInputStream fs = new FileInputStream("C:\\YITP\\Srs1\\Ex4\\basketSer.ser");) {
            ObjectInputStream os = new ObjectInputStream(fs);
        for(int i=0;i<amount;i++) {
            Product deSer = (Product) os.readObject();
            System.out.println(deSer);
        }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
