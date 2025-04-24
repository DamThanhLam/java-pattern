package bai_2;

import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        
        // Observer
        LibraryMember member1 = new LibraryMember("Alice");
        LibraryMember member2 = new LibraryMember("Bob");
        library.registerObserver(member1);
        library.registerObserver(member2);
        
        // Thêm sách
        Book book1 = BookFactory.createBook("paper", "Design Patterns", "GoF", "Programming");
        Book book2 = BookFactory.createBook("ebook", "Clean Code", "Robert C. Martin", "Programming");
        library.addBook(book1);
        library.addBook(book2);
        
        // Tìm kiếm sách
        System.out.println("Searching by title: 'Clean'");
        List<Book> searchResults = library.searchBooks(new SearchByTitle(), "Clean");
        for (Book b : searchResults) {
            b.displayInfo();
        }
        
        // Mượn sách
        Borrowable borrow = new BasicBorrow();
        borrow.borrow();
        
        System.out.println("Extending borrow duration...");
        Borrowable extendedBorrow = new ExtendedBorrow(borrow);
        extendedBorrow.borrow();
    }
}
