package org.example.review;

import org.example.review.abstract_factory.*;
import org.example.review.decorator.BasicBookRent;
import org.example.review.decorator.BookRent;
import org.example.review.decorator.ExtendBookRent;
import org.example.review.enums.TypeSubject;
import org.example.review.model.*;
import org.example.review.observer.LibraryAnnouncement;
import org.example.review.observer.LibraryAnnouncementSubscriber;
import org.example.review.strategy.SearchByAuthor;
import org.example.review.strategy.SearchByCategory;
import org.example.review.strategy.SearchByName;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        User user1 = new User("0","L",null);
        User user2 = new User("1","L",null);
        User user3 = new User("2","L",null);

        List<Book> books = new ArrayList<>();
        Book paperBook1 = BookFactory.getBook(new PaperBookFactory("Book 1","1","paper"));
        books.add(paperBook1);
        Book audioBook2 = BookFactory.getBook(new AudioBookFactory("Book 1","1","audio"));
        books.add(audioBook2);
        Book eBookBook3 = BookFactory.getBook(new EBookFactory("Book 1","1","ebook"));
        books.add(eBookBook3);

        System.out.println("booksSearchByAuthor:");
        List<Book> booksSearchByAuthor = (List<Book>) new SearchByAuthor(books).search("1");
        booksSearchByAuthor.forEach(System.out::println);

        System.out.println("booksSearchByCategory:");
        List<Book> booksSearchByCategory = (List<Book>) new SearchByCategory(books).search("audio");
        booksSearchByCategory.forEach(System.out::println);

        System.out.println("booksSearchByName:");
        List<Book> booksSearchByName = (List<Book>) new SearchByName(books).search("Book 1");
        booksSearchByName.forEach(System.out::println);

        LibraryAnnouncement libraryAnnouncement = new LibraryAnnouncement();
        LibraryAnnouncementSubscriber subscriberUser1 = new LibraryAnnouncementSubscriber(user1,libraryAnnouncement);
        LibraryAnnouncementSubscriber subscriberUser2 = new LibraryAnnouncementSubscriber(user2,libraryAnnouncement);
        LibraryAnnouncementSubscriber subscriberUser3 = new LibraryAnnouncementSubscriber(user3,libraryAnnouncement);


        libraryAnnouncement.register(subscriberUser1);
        libraryAnnouncement.register(subscriberUser2);
        libraryAnnouncement.register(subscriberUser3);

        subscriberUser1.update();

        Book audioBook4 = BookFactory.getBook(new AudioBookFactory("Book 1","1","audio"));
        books.add(audioBook4);

        System.out.println("postMessage:");
        libraryAnnouncement.postMessage(new Message(TypeSubject.BOOKNEW,"Book new", audioBook4));


        System.out.println("ExtendBookRent:");
        BookRent extendBookRent = new ExtendBookRent(new BasicBookRent(audioBook2, LocalDateTime.now(), LocalDateTime.now().plusDays(10)),audioBook4, LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        user1.setBooksRent(extendBookRent);
        extendBookRent.assemble();
    }
}
