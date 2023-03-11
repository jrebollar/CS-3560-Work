package PartOne;

public class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student("John", "CS", 3.5);

        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());
    }
}
