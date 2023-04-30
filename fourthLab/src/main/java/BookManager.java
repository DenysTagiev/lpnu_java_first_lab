import ua.lviv.iot.algo.part2.lab2.Book;
import ua.lviv.iot.algo.part2.lab2.BookWriter;

import java.util.List;

public class BookManager {

    public static void main(String[] args) {
        List<Book> books = List.of(
                new ElectronicBook("PDF", 1024 * 1024),
                new PaperBook(200, 151, 200),
                new PaperBook(300, 200, 250),
                new ElectronicBook("EPUB", 512 * 1024)
        );

        BookWriter bookWriter = new BookWriter();
        bookWriter.writeToFile(books);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

