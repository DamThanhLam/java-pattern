package org.example.review.model;

import org.example.review.decorator.BookRent;

public class User {
    private String id;
    private String username;
    private BookRent booksRent;

    public User(String id, String username, BookRent booksRent) {
        this.id = id;
        this.username = username;
        this.booksRent = booksRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BookRent getBooksRent() {
        return booksRent;
    }

    public void setBooksRent(BookRent booksRent) {
        this.booksRent = booksRent;
    }
}
