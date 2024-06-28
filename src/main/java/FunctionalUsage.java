import pojo.Student;

import java.util.List;

import static util.FunctionalUtil.*;

public class FunctionalUsage {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(1, "Bilal", "Sargodha"),
                new Student(2, "Talha", "Sargodha"),
                new Student(3, "Huzaifa", "Sialkot"),
                new Student(4, "Raiha", "Quetta"),
                new Student(5, "Faareha", "Quetta"),
                new Student(6, "Hassan", "Sialkot"),
                new Student(7, "Ayesha", "Sialkot"),
                new Student(8, "Maaha", "Multan"),
                new Student(9, "Khubaib", "Lahore"),
                new Student(10, "Arwa", "Lahore"),
                new Student(11, "Alisha", "Lahore"),
                new Student(12, "Muhammad", "Lahore"),
                new Student(13, "Haadi", "Lahore"),
                new Student(14, "Ibrahim", "Lahore")
        );


        List<Student> filteredStudents = filter(
                students,
                student -> "lahore".equalsIgnoreCase(student.city())
        );

        forEach(filteredStudents, student -> System.out.println(student.name()));


        List<String> names = map(students, student -> student.name());
        forEach(names, name -> System.out.println(name));

    }










}
