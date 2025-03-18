package org.example.review.model;

import org.example.review.enums.TypeSubject;

public class Message {
    private TypeSubject type;
    private String content;
    private Book book;

    public Message(TypeSubject type, String content, Book book) {
        this.type = type;
        this.content = content;
        this.book = book;
    }


    public TypeSubject getType() {
        return type;
    }

    public void setType(TypeSubject type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Message [type=" + type + ", content=" + content + ", book=" + book + "]";
    }
}
