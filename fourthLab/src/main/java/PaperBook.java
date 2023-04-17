import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part2.lab2.Book;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class PaperBook extends Book {
    private int pageCount;
    private double widthInMillimeters;
    private double heightInMillimeters;

    @Override
    public int getPagesCount() {
        return pageCount;
    }

    @Override
    public String getBookType() {
        return "Paper Book";
    }

    public String getHeaders() {
        return super.getHeaders() + ", pageCount, widthInMillimeters, heightInMillimeters";
    }

    public String toCSV() {
        return super.toCSV() + "," + pageCount + "," + widthInMillimeters + "," + heightInMillimeters;
    }
}
