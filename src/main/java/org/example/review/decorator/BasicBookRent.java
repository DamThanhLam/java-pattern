package org.example.review.decorator;

import org.example.review.model.Book;

import java.time.LocalDateTime;

public class BasicBookRent implements BookRent {
    private LocalDateTime start;
    private LocalDateTime end;
    private Book book;

    public BasicBookRent(Book book,LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
        this.book = book;
    }

    @Override
    public void assemble() {
        System.out.println(book.toString()+": "+start.toString() + "-" + end.toString());
    }
}
