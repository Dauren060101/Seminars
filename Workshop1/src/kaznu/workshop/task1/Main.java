package kaznu.workshop.task1;
//Создать массив типа Инструмент, содержащий инструменты разного типа. В цикле вызвать метод play() для каждого инструмента,
// который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
public class Main {
    public static void main(String[] args){
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(3);
        instruments[1] = new Drum(32);
        instruments[2] = new Trumpet(.45);
        for(Instrument i : instruments){
            i.play();
        }
    }
}
