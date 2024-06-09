package demo;

import java.util.Scanner;

public class ConsoleStudentReader {

    public Student read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter student number: ");
        String studentNumber = sc.nextLine();

        return new Student(studentId, studentName, studentNumber);
    }

}
