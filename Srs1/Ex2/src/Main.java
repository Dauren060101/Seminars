/**
 * 2.Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * а) Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
 * б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 тенге, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 тенге, иначе 180.
 * г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Main {

    public static void main(String[] args){
        Student s1 = new Student("Student1","2","2",5.0);//создание объекта класса Student
        Student[] arr = new Student[10];//создание массива типа Student
        arr[0] = s1;
        Aspirant as1 = new Aspirant("Aspirant1","2","2",4.0,"science");//создание объекта типа Aspirant
        arr[1] = as1;
        System.out.println(arr[0].firstName+"'s scholarship: "+arr[0].getScholarship());
        System.out.println(arr[1].firstName+"'s scholarship: "+arr[1].getScholarship());
        Student s2 = as1;//переменная типа Student, которая ссылается на объект типа Aspirant


    }
}
