public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private int yearOfPublication;
    private Writer writer;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.print("Author: " + this.author + " | ");
        System.out.print("Title: " + this.title + " | ");
        System.out.print("Publisher: " + this.publisher + " | ");
        System.out.print("Year of publication: " + this.yearOfPublication + " | ");
        System.out.println("Author: " + this.getWriter().getFirstName() + " " + this.getWriter().getLastName() );
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }



}

