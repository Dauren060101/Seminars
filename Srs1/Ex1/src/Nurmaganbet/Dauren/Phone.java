/**Задания:
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Выведите на консоль значения их переменных.
 * г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * ж) Добавить конструктор без параметров.
 * з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 */
package Nurmaganbet.Dauren;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone() { }//конструктор без параметров.

    public Phone(String number, String model) {//конструктор, который принимает на вход два параметра для инициализации переменных класса
        this.number = number;
        this.model = model;
    }


    public Phone(String number, String model, double weight) {//конструктор с тремя параметрами который вызывает конструктор с двумя
        this(number,model);
        this.weight = weight;
    }


    public void receiveCall(String name) {
        System.out.println("/////////////////////////");
        System.out.println("//// Звонит " + name+"////");
        System.out.println("////////////\uD83D\uDCDE///////////");
    }

    public void receiveCall(String name, String number) {
        System.out.println("/////////////////////////");
        System.out.println("//// Звонит " + name+"////");
        System.out.println("////  "+number+"  /////");
        System.out.println("////////////\uD83D\uDCDE///////////");
    }

    public String getNumber() {
        return this.number;
    }
}
