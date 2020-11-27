public class WrongLoginException extends  Exception{
    private final String error;

    public WrongLoginException(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Ошибка."+error;
    }
}
