import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>();

    public Library(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public void display() {
        for (Book book : shelf) {
            System.out.print("Title: " + book.getTitle()+ " | ");
            System.out.print("Author: " + book.getAuthor()+ " | ");
            System.out.print("Publisher: " + book.getPublisher()+ " | ");
            System.out.print("Year of publication: " + book.getYearOfPublication()+ " | ");
            System.out.print("Author: " + book.getWriter().getFirstName() + " " + book.getWriter().getLastName() );
            System.out.println();
        }
    }

    public void addBook( Book book) {
        shelf.add(book);
    }
}
