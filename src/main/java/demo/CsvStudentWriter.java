package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CsvStudentWriter {

    public void write(Student student) throws IOException {
        Path studentFilePath = Path.of("student.csv");
        String input = STR."\{student.id()},\{student.name()},\{student.phone()}";
        Files.writeString(studentFilePath, input, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

}
