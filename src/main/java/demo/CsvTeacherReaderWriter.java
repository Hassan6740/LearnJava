package demo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class CsvTeacherReaderWriter {

    private static final Path FILE_PATH = Path.of("teacher.csv");

    public void write(Teacher teacher) throws IOException {
        String record = STR."\{teacher.name()},\{teacher.address()}";
        CsvUtil.writeLine(FILE_PATH, record);
    }

    public List<Teacher> read() {
        //TODO
        return null;
    }

}
