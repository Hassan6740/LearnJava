package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;  // Import the Scanner class

public class Teacher {
    private String teacherName;
    private String teacherAddress;

    public Teacher() {
    }

    public Teacher(String teacherName, String teacherAddress) {
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
    }

    public void getTeacher() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Teacher Name: ");
        this.teacherName = in.nextLine();
        System.out.print("Enter Teacher Address: ");
        this.teacherAddress = in.nextLine();
    }

    public void displayTeacher() {
        System.out.println(STR."Teacher Name: \{this.teacherName}");
        System.out.println(STR."Teacher Address: \{this.teacherAddress}");
    }

    public void writeTeacher() throws IOException {
        Path teacherFilePath = Path.of("teacher.csv");

        String input = STR."\{teacherName},\{teacherAddress}";

        Files.writeString(teacherFilePath, input, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }
}