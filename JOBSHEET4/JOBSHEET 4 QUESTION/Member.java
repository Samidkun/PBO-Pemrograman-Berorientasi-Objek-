package LibrarySamid;

import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("Buku ini tidak dipinjam oleh anggota.");
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            System.out.println("Daftar buku yang dipinjam oleh " + name + ":");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor());
            }
        }
    }
}
