
import java.util.Scanner;

public class Main {
    static String LoginRegex="[A-Za-z0-9_]{1,20}";

    static boolean checkLogin(String login) throws Exception {

        try {
            if(!login.matches(LoginRegex)){
                throw new WrongLoginException("Login должен содержать только латинские буквы, цифры и знак подчеркивания");
            }
        }
        catch (WrongLoginException e){
            System.out.println(e.toString());
            return false;
        }

        return true;
    }
    static boolean checkPassword(String pass){
        try {
            if(!pass.matches(LoginRegex)){
                throw new WrongPasswordException("Пароль не соответствует правилам");
            }
        } catch (WrongPasswordException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;

    }
    public static void main(String[] args) throws Exception {
        String login,password,confirmPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        login=scanner.next();
        while(!checkLogin(login)){
            System.out.println("Логин заполнен неправильно.Попробуйте еще раз.");
            System.out.print("Login: ");
            login=scanner.next();
        }
        System.out.println("Логин заполнен правильно.Введите пароль");
        password=scanner.next();
        while (!checkPassword(password)){
            System.out.println("Пароль заполнен неправильно.Попробуйте еще раз.");
            System.out.print("Password: ");
            password=scanner.next();
        }

        System.out.println("Пароль соответсвует правилам.Подтвердите пароль");
        System.out.print("Confirm password: ");
        confirmPassword=scanner.next();

        while(!confirmPassword.equals(password)){
            System.out.println("Этот пароль не совпадает с паролем, введенным в поле пароля, попробуйте еще раз. ");
            confirmPassword=scanner.next();
        }
        System.out.println("Регистрация прошла успешно");

    }
}
