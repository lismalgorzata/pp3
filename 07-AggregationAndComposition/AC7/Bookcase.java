package AC7;

import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> bookArray = new ArrayList<Book>();

    public void placeBook(Book book) {
        bookArray.add(book);
    }

    public void removeBook(String bookTitle) {
        int index = 0 ;
        for (Book book : bookArray) {
            if (book.getTitle().equals(bookTitle)) {
                bookArray.remove(index);
            }
            index ++;
        }
    }

    public void displayBooks() {
        for (Book book : bookArray){
            System.out.println(book.getTitle());
        }
    }

}
