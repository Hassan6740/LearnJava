package csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {

    private static final String FIELD_DELIMITER = ",";
    private static final String RECORD_SEPARATOR = "\n";


    public static void writeLine(Path path, String[] record) throws IOException {
        String line = String.join(FIELD_DELIMITER, record) + RECORD_SEPARATOR;
        Files.writeString(path, line, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public static List<String[]> readFile(Path path) throws IOException {
        List<String[]> result = new ArrayList<>();

        List<String> strings = Files.readAllLines(path);
        for (String line : strings) {
            String[] fields = line.split(FIELD_DELIMITER);
            result.add(fields);
        }
        return result;
    }


}
