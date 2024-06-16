import console.ConsoleStudentReader;
import console.ConsoleTeacherReader;
import csv.CsvStudentReaderWriter;
import csv.CsvTeacherReaderWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import pojo.Student;
import pojo.Teacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

void main() throws IOException {

    ConsoleStudentReader studentReader = new ConsoleStudentReader();
    CsvStudentReaderWriter studentWriter = new CsvStudentReaderWriter();

    ConsoleTeacherReader teacherReader = new ConsoleTeacherReader();
    CsvTeacherReaderWriter teacherWriter = new CsvTeacherReaderWriter();

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("1 to Enter Student Information");
        System.out.println("2 to Enter Teacher Information");
        System.out.println("3 to View Students Information from File");
        System.out.println("4 to View Teachers Information from File");
        System.out.println("5 to Search Student By City");
        System.out.println("Q to quit");
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                Student student = studentReader.read();
                System.out.println(student);
                studentWriter.write(student);
                break;

            case '2':
                Teacher teacher = teacherReader.read();
                System.out.println(teacher);
                teacherWriter.write(teacher);
                break;
            case '3':
                List<Student> students = studentWriter.read();
                onEach(students, st -> System.out.println(st));
                break;
            case '4':
                List<Teacher> teachers = teacherWriter.read();
                onEach(teachers, t -> System.out.println(t));
                break;
            case '5':
                System.out.print("Enter City : ");
                sc.nextLine();
                String city = sc.nextLine();
                List<Student> students1 = studentWriter.read();
                List<Student> studentsByCity = filter(students1, s -> s.name().equalsIgnoreCase(city));
                onEach(studentsByCity, t -> System.out.println(t));
                break;

            case 'Q':
            case 'q':
                System.out.println("Quitting the program...");
                System.exit(0);

            default:
                System.out.println("Invalid choice.");
                break;

        }
    }
}

private static <T> void onEach(List<T> list, Consumer<T> consumer) {
    for (T obj : list) {
        consumer.accept(obj);
    }
}

private static <T> List<T> filter(List<T> list, Predicate<T> criteria) {
    List<T> filtered = new ArrayList<>();
    for (T obj : list) {
        if (criteria.test(obj)) {
            filtered.add(obj);
        }
    }
    return filtered;
}