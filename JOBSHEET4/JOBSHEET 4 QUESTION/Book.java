package LibrarySamid;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Buku telah dipinjam.");
        } else {
            System.out.println("Buku tidak tersedia.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Buku telah dikembalikan.");
    }
}
