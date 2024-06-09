package demo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class CsvStudentReaderWriter {

    private static final Path FILE_PATH = Path.of("student.csv");

    public void write(Student student) throws IOException {
        String record = STR."\{student.id()},\{student.name()},\{student.phone()}";
        CsvUtil.writeLine(FILE_PATH, record);
    }

    public List<Student> read() {
        //TODO
        return null;
    }


}
