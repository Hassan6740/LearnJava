package demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvStudentReaderWriter {

    private static final Path FILE_PATH = Path.of("student.csv");

    public void write(Student student) throws IOException {
        String record = STR."\{student.id()},\{student.name()},\{student.phone()}";
        CsvUtil.writeLine(FILE_PATH, record);
    }

    public List<Student> read() throws IOException {
        List<String> strings = Files.readAllLines(FILE_PATH);
        for (String line : strings) {
            System.out.println(line);
        }
        String line = "1,Hassan,123";
        String[] parts = line.split(",");

        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        String phone = parts[2];
        new Student(id, name, phone);

        List<Student> students = new ArrayList<>();
        students.add(new Student(id, name, phone));
        return null;
    }
}
