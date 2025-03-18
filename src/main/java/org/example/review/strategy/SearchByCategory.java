package org.example.review.strategy;

import org.example.review.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByCategory implements SearchStrategy {
    List<Book> books;
    public SearchByCategory(List<Book> books) {
        this.books = books;
    }
    @Override
    public Object search(Object searchParam) {
        return books.stream().filter(item -> item.getCategory().equals(searchParam)).collect(Collectors.toList());
    }
}
