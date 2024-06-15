package csv;

import java.nio.file.Path;
import pojo.Student;

public class CsvStudentReaderWriter extends CsvReaderWriter<Student> {

    private static final Path FILE_PATH = Path.of("student.csv");

    public CsvStudentReaderWriter() {
        super(FILE_PATH);
    }

    @Override
    public Student fromRecord(String[] record) {
        int id = Integer.parseInt(record[0]);
        String name = record[1];
        String phone = record[2];
        return new Student(id, name, phone);
    }

    @Override
    public String[] toRecord(Student student) {
        return new String[] {
                String.valueOf(student.id()),
                student.name(),
                student.phone()
        };
    }
}
