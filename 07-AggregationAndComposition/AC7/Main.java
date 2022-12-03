package AC7;

public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer("Małgosia", "Lis", 20);
        Book book1 = new Book(writer, 160, "Przestrzeń kwantowa", "Naukowa", 89);
        Book book2 = new Book(writer, 400, "Dom Gucci", "Fabularna", 158);

        Bookcase bookcase = new Bookcase();
        bookcase.placeBook(book1);
        bookcase.placeBook(book2);
        bookcase.displayBooks();

        book1.newChapter("Epilog",1);
        book1.newChapter("Początek",2);
        book1.displayChapters();
    }
}
