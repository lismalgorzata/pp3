import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Harry Potta", "JKRownling");
        Book book2 = new Ebook("Harry Potta 2", "JKRownling", "harri.txt");
        Book book3 = new Audiobook("Harry Potta 3", "JKRownling", 2, 10);

        book1.setWriter(new Writer("Jan", "Kowalski", "fantasy"));
        book2.setWriter(new Writer("Jan", "Nowak", "fantasy"));
        book3.setWriter(new Writer("Jan", "Stolarksi", "fantasy"));

        books.add(book1);
        books.add(book2);
        books.add(book3);


        Library library = new Library(books);
        library.display();

        book1.display();
        book2.display();
        book3.display();
    }
}
