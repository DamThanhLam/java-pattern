package org.example.review.abstract_factory;

import org.example.review.model.AudioBook;
import org.example.review.model.Book;
import org.example.review.model.EBook;

public class EBookFactory implements BookAbstractFactory{
    private String title;
    private String author;
    private String category;
    public EBookFactory(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public Book createBook() {
        return new AudioBook(title, author,category);
    }
}
