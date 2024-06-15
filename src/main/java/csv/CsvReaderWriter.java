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
        String record = toRecord(csvSupported);
        CsvUtil.writeLine(filePath, record);
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

    public abstract String toRecord(T csvSupported);
    public abstract T fromRecord(String[] record);
}
