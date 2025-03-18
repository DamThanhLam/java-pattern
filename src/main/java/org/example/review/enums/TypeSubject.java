package org.example.review.enums;

public enum TypeSubject {
    BOOKNEW("book_new"),
    EXPIRED("expired");
    private String value;
    TypeSubject(String bookNew) {
        this.value = bookNew;
    }
}
