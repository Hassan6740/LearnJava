package csv;

import java.nio.file.Path;
import pojo.Teacher;

public class CsvTeacherReaderWriter extends CsvReaderWriter<Teacher> {

    private static final Path FILE_PATH = Path.of("teacher.csv");

    public CsvTeacherReaderWriter() {
        super(FILE_PATH);
    }

    @Override
    public Teacher fromRecord(String[] record) {
        String name = record[0];
        String address = record[1];
        return new Teacher(name, address);
    }

    @Override
    public String toRecord(Teacher teacher) {
        return teacher.name() + "," + teacher.address();
    }

}
