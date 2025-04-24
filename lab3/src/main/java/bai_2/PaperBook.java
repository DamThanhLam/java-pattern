package bai_2;

class PaperBook extends Book {
    public PaperBook(String title, String author, String genre) {
        super(title, author, genre);
    }
    public void displayInfo() {
        System.out.println("Paper Book: " + title + " by " + author);
    }
}
