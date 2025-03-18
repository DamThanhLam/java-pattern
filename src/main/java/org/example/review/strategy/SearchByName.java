package org.example.review.strategy;

import org.example.review.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByName implements SearchStrategy {
    List<Book> books;
    public SearchByName(List<Book> books) {
        this.books = books;
    }
    @Override
    public Object search(Object searchParam) {
        return books.stream().filter(item-> item.getTitle().contains(searchParam.toString())).collect(Collectors.toList());
    }
}
