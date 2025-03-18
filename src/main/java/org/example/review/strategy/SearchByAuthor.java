package org.example.review.strategy;

import org.example.review.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByAuthor implements SearchStrategy {

    List<Book> books;
    public SearchByAuthor(List<Book> books) {
        this.books = books;
    }

    @Override
    public Object search(Object searchParam) {
        return books.stream().filter(item -> item.getAuthor().equals(searchParam)).collect(Collectors.toList());
    }
}
