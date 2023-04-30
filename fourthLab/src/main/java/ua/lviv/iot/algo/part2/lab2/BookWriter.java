package ua.lviv.iot.algo.part2.lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookWriter extends Book{
    private static final String FILENAME = "books.csv";

    public void writeToFile(List<Book> books) {
        try (FileWriter writer = new FileWriter(FILENAME)) {

            writer.write(books.get(0).getHeaders() + "\n");


            for (Book book : books) {
                writer.write(book.toCSV() + "\n");
            }

            System.out.println("Файл успішно записано!");
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    @Override
    public int getPagesCount() {
        return 0;
    }

    @Override
    public String getBookType() {
        return null;
    }

}

