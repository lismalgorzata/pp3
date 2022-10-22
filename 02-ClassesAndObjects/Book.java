public class Book {
    String title;
    String author;
    int pagesNumber;
    boolean isOpen;
    int pageNumber = 0;

    public void displayBookInfo() {
        if (isOpen) {
            while (pageNumber < pagesNumber) {
                System.out.println("Autor: " + author);
                System.out.println("Tile: " + title);
                System.out.println("Number of pages: " + pagesNumber);
                System.out.println("Current page: "+ pageNumber);
                break;
            }
        } else {
            System.out.println("Open the book first");
        }
    }

    public void openBook() {
        isOpen = true;
        System.out.println("Book is open");
    }

    public void closeBook() {
        isOpen = false;
        System.out.println("Book is closed");
    }

    public void readBook() {
        if (isOpen) {
            pageNumber ++;
        } else {
            System.out.println("Open the book first");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.title = "The setting sun";
        book1.author = "Osamu Dazai";
        book1.pagesNumber=200;

        book1.openBook();
        book1.displayBookInfo();
        book1.readBook();
        book1.readBook();
        book1.readBook();
        book1.displayBookInfo();
        book1.closeBook();

        book2.title = "Pride and prejustice";
        book2.author = "Jane Austen";
        book2.pagesNumber = 350;

        book2.displayBookInfo();
        book2.openBook();
        book2.readBook();
        book2.displayBookInfo();
        book2.closeBook();
        book2.displayBookInfo();
        book2.readBook();
    }
}