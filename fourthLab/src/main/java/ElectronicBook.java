import lombok.*;
import ua.lviv.iot.algo.part2.lab2.Book;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class ElectronicBook extends Book {
    private String format;
    private long fileSizeInBytes;
    private static final int BYTES_PER_PAGE_COUNT = 1024;

    @Override
    public int getPagesCount() {
        return (int) (fileSizeInBytes / BYTES_PER_PAGE_COUNT);
    }

    @Override
    public String getBookType() {
        return "Electronic Book";
    }

    public String getHeaders() {
        return super.getHeaders() + ", format, fileSizeInBytes";
    }

    public String toCSV() {
        return super.toCSV() + "," + format + "," + fileSizeInBytes;
    }
}
