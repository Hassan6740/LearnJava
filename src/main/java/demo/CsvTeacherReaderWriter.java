package demo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvTeacherReaderWriter {

    private static final Path FILE_PATH = Path.of("teacher.csv");

    public void write(Teacher teacher) throws IOException {
        String record = STR."\{teacher.name()},\{teacher.address()}";
        CsvUtil.writeLine(FILE_PATH, record);
    }

    public List<Teacher> read() throws IOException {
        List<Teacher> teachers = new ArrayList<>();

        List<String[]> records = CsvUtil.readFile(FILE_PATH);
        for (String[] record : records) {
            String name = record[0];
            String address = record[1];
            Teacher teacher = new Teacher(name, address);
            teachers.add(teacher);
        }
        return teachers;
    }

}
