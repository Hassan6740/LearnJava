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
        List<Student> students = new ArrayList<>();

        List<String[]> records = CsvUtil.readFile(FILE_PATH);
        for (String[] record : records) {
            int id = Integer.parseInt(record[0]);
            String name = record[1];
            String phone = record[2];
            Student student = new Student(id, name, phone);
            students.add(student);
        }
        return students;
    }
}
