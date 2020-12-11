/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * в) Создать класс Basket, содержащий массив купленных товаров.
 * г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
 */
public class Main {
    public static void main(String[] args) {
        User customer = new User("admin", "root");//создание объекта класса User
        Product laptop = new Product("HP Pavilion Gaming - 15-ec0013ur", 320000, 4.7);//создание объекта класса товар
        Product laptop1 = new Product("Acer NITRO 5 - 15-ec0013ur", 320000, 4.7);
        customer.buy(laptop);//покупка товара пользователем
        customer.buy(laptop1);
        customer.purchased.show();//показ купленных товаров
        customer.purchased.serialize();
        customer.purchased.deSerialize();

    }
}
