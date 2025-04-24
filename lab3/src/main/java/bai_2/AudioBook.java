package bai_2;

class AudioBook extends Book {
    public AudioBook(String title, String author, String genre) {
        super(title, author, genre);
    }
    public void displayInfo() {
        System.out.println("Audio Book: " + title + " by " + author);
    }
}
