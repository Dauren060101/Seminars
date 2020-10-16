package kaznu.workshop.task2;

public class Atelier {
    public void dressMan(Clothes[] arr){
        for(Clothes i:arr){
            if(i instanceof MenClothing){
                ((MenClothing) i).dressMan();
                System.out.println("Размер: "+i.getSize().getDescription());
                System.out.println("Цена: "+i.getPrice());
                System.out.println("Цвет: "+i.getColour());

            }
        }
    }
    public void dressWoman(Clothes[] arr){
        for(Clothes i:arr){
            if(i instanceof WomenClothing){
                ((WomenClothing) i).dressWoman();
                System.out.println("Размер: "+i.getSize().getDescription());
                System.out.println("Цена: "+i.getPrice());
                System.out.println("Цвет: "+i.getColour());

            }
        }
    }
}
