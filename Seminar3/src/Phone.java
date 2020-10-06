/**
   * Класс Phone с переменными строчного типа number и country
   *Реализовать подсчет количества созданных телефонов (класс Phone) с помощью статической переменной.
 */
public class Phone {
    String number;
    String country;
    static int amount=0;
    public Phone(String number,String country){//конструктор класса Phone
        this.number = number;
        this.country = country;
        amount++;
    }

}
