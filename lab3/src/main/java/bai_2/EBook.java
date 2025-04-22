package bai_2;

class EBook extends Book {
    public EBook(String title, String author, String genre) {
        super(title, author, genre);
    }
    public void displayInfo() {
        System.out.println("E-Book: " + title + " by " + author);
    }
}

