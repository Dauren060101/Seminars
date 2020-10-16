package kaznu.workshop.task2;



public class Main {

    public static void main(String[] args){
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.M,5490,"синий");
        clothes[1] = new Skirt(Size.S,6990,"коричневый");
        clothes[2] = new Pants(Size.L,7000,"черный");
        clothes[3] = new Tie(Size.S,2490,"красный");
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);
    }
}
