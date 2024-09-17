package LibrarySamid;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Samid Sang Petualang", "Ilham kopling");
        Book book2 = new Book("The Legend Of Samid", "Patra Setengah Kopling");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Sucap As Safrizal");
        library.registerMember(member1);

        System.out.println("Daftar buku di perpustakaan:");
        library.listBooks();

        member1.borrowBook(book1);

        System.out.println("\nBuku yang dipinjam oleh " + member1.getName() + ":");
        member1.listBorrowedBooks();

        member1.returnBook(book1);

        System.out.println("\nDaftar buku yang dipinjam setelah pengembalian:");
        member1.listBorrowedBooks();

        System.out.println("\nStatus buku di perpustakaan:");
        library.listBooks();
    }
}
