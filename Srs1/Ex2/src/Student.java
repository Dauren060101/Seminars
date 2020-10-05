/**
 * 2.Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * а) Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
 * б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 тенге, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 тенге, иначе 180.
 * г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    Student[] array = new Student[100];
    public Student(String firstName,String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public Student(){};

    public int getScholarship(){
        if (averageMark == 5){
            return 1000;
        }
        return 80;
    }
}
class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName,String lastName, String group, double averageMark, String science) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scienceWork = science;
    }

    @Override
    public int getScholarship() {
        if(averageMark == 5.0){
            return 200;
        }
        return 180;
    }
}
