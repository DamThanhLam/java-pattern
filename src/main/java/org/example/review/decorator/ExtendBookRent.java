package org.example.review.decorator;

import org.example.review.model.Book;

import java.time.LocalDateTime;

public class ExtendBookRent extends BookRentDecorator {
    private LocalDateTime start;
    private LocalDateTime end;
    private Book book;
    public ExtendBookRent(BookRent bookRent, Book book, LocalDateTime start, LocalDateTime end) {
        super(bookRent);
        this.book = book;
        this.start = start;
        this.end = end;
    }

    @Override
    public void assemble() {
        bookRent.assemble();
        if (book != null && start != null && end != null) {
            System.out.println(book.toString() + ": " + start.toString() + "-" + end.toString());
        } else {
            System.out.println("Extend book rent details are not set.");
        }
    }
}
