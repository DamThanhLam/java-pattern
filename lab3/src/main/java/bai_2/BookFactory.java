package bai_2;

class BookFactory {
    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "paper": return new PaperBook(title, author, genre);
            case "ebook": return new EBook(title, author, genre);
            case "audio": return new AudioBook(title, author, genre);
            default: throw new IllegalArgumentException("Unknown book type");
        }
    }
}
