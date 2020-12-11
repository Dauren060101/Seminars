import java.io.Serializable;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 */
public class Product implements Serializable {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {//конструктор класса
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{\n\t"+this.name+"\n\t"+this.rating+"\n\t"+this.price+"\n}";
    }
}

