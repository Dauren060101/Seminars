public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }

    @Override
    public String toString() {
        return "Ошибка."+getMessage();
    }
}
