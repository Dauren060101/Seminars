
public class Main {
    /**
     * Создайте объекты класса Double, используя методы valueOf().
     * б) Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
     * в) Преобразовать объект класса Double ко всем примитивным типам.
     * г) Вывести значение объекта Double на консоль.
     * д) Преобразовать литерал типа double к строке
     * @param args
     */
    public static  void main(String[] args) {
        double dob = java.lang.Double.valueOf(24.5);

        String string = "24.5";
        
        double stringToDouble = java.lang.Double.parseDouble(string);

        Double newDouble = new Double("45.2");
        int dobToInt = newDouble.intValue();
        float dobToFloat = newDouble.floatValue();
        short dobToShort = newDouble.shortValue();
        long dobToLong = newDouble.longValue();
        byte dobToByte = newDouble.byteValue();

        System.out.println(dob);
        System.out.println(newDouble);

        String dobToString = Double.toString(78.5);
    }
}
