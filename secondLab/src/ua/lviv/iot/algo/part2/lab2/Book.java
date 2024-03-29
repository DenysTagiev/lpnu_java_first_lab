package ua.lviv.iot.algo.part2.lab2;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;

    public abstract int getPagesCount();

    public abstract String getBookType();

    private static final int BYTES_PER_PAGE_COUNT = 1024;
}