package org.example.review.decorator;

public class BookRentDecorator implements BookRent{
    protected BookRent bookRent;
    public BookRentDecorator(BookRent bookRent) {
        this.bookRent = bookRent;
    }
    @Override
    public void assemble() {
        this.bookRent.assemble();
    }
}
