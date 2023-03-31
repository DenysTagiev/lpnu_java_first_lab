import lombok.*;
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
}
