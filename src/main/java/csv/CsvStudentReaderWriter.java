package csv;

import java.nio.file.Path;
import pojo.Student;

public class CsvStudentReaderWriter extends CsvReaderWriter<Student> {

    private static final Path FILE_PATH = Path.of("student.csv");

    public CsvStudentReaderWriter() {
        super(FILE_PATH);
    }

    @Override
    public Student fromFields(String[] record) {
        int id = Integer.parseInt(record[0]);
        String name = record[1];
        String city = record[2];
        return new Student(id, name, city);
    }

    @Override
    public String[] toFields(Student student) {
        return new String[] {
                String.valueOf(student.id()),
                student.name(),
                student.city()
        };
    }
}
