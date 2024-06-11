package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {

    public static void writeLine(Path path, String line) throws IOException {
        Files.writeString(path, line + "\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }
    private static final Path teacherFilePath = Path.of("teacher.csv");
    private static final Path studentFilePath = Path.of("student.csv");

    public static List<String[]> readStudentFile(Path path) throws IOException {
        List<String> strings = Files.readAllLines(studentFilePath);
        for (String line : strings) {
            System.out.println(line);
        }
        return null;
    }
    public static List<String[]> readTeacherFile(Path path) throws IOException {
        List<String> strings = Files.readAllLines(teacherFilePath);
        for (String line : strings) {
            System.out.println(line);
        }
        return null;
    }
}


    //Helping Logic
//    public static void main(String[] args) throws IOException {


//        //How to read file
//        Path path = Path.of("student.csv");
//        List<String> lines = Files.readAllLines(path);
//
//        for (String line : lines) {
//            System.out.println(line);
//        }

//        //Parse line
//        String line = "1,Hassan,1232132";
//        String[] parts = line.split(",");
//
//        int id = Integer.parseInt(parts[0]);
//        String name = parts[1];
//        String phone = parts[2];
//
//        new Student(id, name, phone);


//        //Collection of objects
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Hassan", "Sialkot"));
//        students.add(new Student(2, "Huzaifa", "Sialkot"));
//        students.add(new Student(3, "Haadi", "Lahore"));
//        students.add(new Student(4, "Talha", "Sargodha"));


//    }