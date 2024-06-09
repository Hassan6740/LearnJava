package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;  // Import the Scanner class

public class Student {
    private int studentId;
    private String studentName;
    private String studentNumber;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter student number: ");
        studentNumber = sc.nextLine();
    }

    public void displayStudent() {
        System.out.println(STR."Student ID: \{studentId}");
        System.out.println(STR."Student Name: \{studentName}");
        System.out.println(STR."Student Number: \{studentNumber}");
    }

    public void studentWrite() throws IOException {
        Path studentFilePath = Path.of("student.csv");

        String input = STR."\{studentId},\{studentName},\{studentNumber}";

        Files.writeString(studentFilePath, input, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

}