package ua.lviv.iot.algo.part1.lab1;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;
    private int countInWarehouse;

    public boolean getBook(int quantity) {
        if (countInWarehouse - quantity <= countInWarehouse) {
            countInWarehouse -= quantity;
            return true;
        }
        else {
            return false;
        }

    }
    public boolean hasMoreBooks() {
        if (countInWarehouse >= 0){
            return true;
        }
        else {
            return false;
        }
    }

    private static Book instance = new Book();

    public static Book getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book();
        books[1] = new Book("Father", "Maks", "Ivan", 2005, "Novel", 130);
        books[2] = Book.getInstance();
        books[3] = Book.getInstance();

        for (Book book:books) {


            System.out.println(book);
        }
    }

}