/**
 * г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
 */
public class User {
    String login;
    String password;
    Basket purchased = new Basket();

    public User(String login, String password) {//конструктор класса
        this.login = login;
        this.password = password;

    }

    public void buy(Product product) {//добавил метод покупки
        this.purchased.add(product);
    }
}
