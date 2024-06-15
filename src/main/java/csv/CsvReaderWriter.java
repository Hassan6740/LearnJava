package csv;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class CsvReaderWriter<T> {

    private final Path filePath;

    public CsvReaderWriter(Path filePath) {
        this.filePath = filePath;
    }

    public void write(T csvSupported) throws IOException {
        String[] record = toRecord(csvSupported);
        String csvLine = toCsvLine(record);
        CsvUtil.writeLine(filePath, csvLine);
    }

    private String toCsvLine(String[] record)  {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < record.length; i++) {
            String field = record[i];
            line.append(field);
            if (i < record.length - 1) {
                line.append(",") ;
            }
        }
        return line.toString();
    }

    public List<T> read() throws IOException {
        List<T> list = new ArrayList<>();

        List<String[]> records = CsvUtil.readFile(filePath);
        for (String[] record : records) {
            T csvSupported = fromRecord(record);
            list.add(csvSupported);
        }
        return list;
    }

    public abstract String[] toRecord(T csvSupported);
    public abstract T fromRecord(String[] record);
}
