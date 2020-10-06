public class Base {

    public static void main(String[] args){
        Phone phone1= new Phone("+7xxxxxxxxxx","KZ");//creating Phone object
        System.out.println(phone1.country);
        System.out.println(Phone.amount);
        Phone phone2= new Phone("+7xxxxxxxxxx","KZ");
        System.out.println(Phone.amount);
        //Testing swap method
        int number1 = 54;
        int number2 = 25;
        System.out.println("Number1 = "+number1+", Number2 = "+number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("Number1 = "+number1+", Number2 = "+number2);
    }
}
