package demo;

import java.io.IOException;
import java.nio.file.Files;
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
        List<String> strings = Files.readAllLines(FILE_PATH);
        for (String line : strings) {
            System.out.println(line);
        }
        String line = "Bilal,211-A";
        String[] parts = line.split(",");

        for (String part : parts) {
            System.out.println(part);
        }
        String name = parts[0];
        String address = parts[1];
        new Teacher(name, address);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(name, address));
        return null;
    }

}
