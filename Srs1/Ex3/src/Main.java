/**
 * 3.Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Метод sleep, например, может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
 */
public class Main {
    public static void main(String[] args){

        Cat garfield = new Cat("лазанья","дом");
        Dog kabosu = new Dog("косточка","дом");
        Horse bojack = new Horse("трава","ферма");
        Animal[] array = {garfield,kabosu,bojack};

        Veterinarian doctor = new Veterinarian();
        for(Animal i:array){
            doctor.treatAnimal(i);
            System.out.println("----------");
        }


    }
}
