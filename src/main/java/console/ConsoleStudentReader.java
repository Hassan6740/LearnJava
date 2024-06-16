package console;

import pojo.Student;
import java.util.Scanner;

public class ConsoleStudentReader {

    public Student read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student city: ");
        String city = sc.nextLine();

        return new Student(id, name, city);
    }

}
