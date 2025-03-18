package org.example.review.abstract_factory;

import org.example.review.model.Book;

public class BookFactory {
    public static Book getBook(BookAbstractFactory factory) {
        return factory.createBook();
    }
}
