package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CsvTeacherWriter {

    public void write(Teacher teacher) throws IOException {
        Path teacherFilePath = Path.of("teacher.csv");
        String input = STR."\{teacher.name()},\{teacher.address()}";
        Files.writeString(teacherFilePath, input, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

}
