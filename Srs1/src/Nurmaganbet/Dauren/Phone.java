package Nurmaganbet.Dauren;
public class Phone {
    String number="+7xxxxxxxxxx";
    String model="xxx";
    double weight=  123.7;
    public Phone(String number,String model,double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number,String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }
    public void receiveCall(String name,String number){
        System.out.println("Звонит "+name);
        System.out.println(number);
    }
    public  String getNumber(){
        return this.number;
    }
}
