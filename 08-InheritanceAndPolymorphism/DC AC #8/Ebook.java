public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title,author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.print("Filename: "+ fileName +" | ");
        System.out.print("Author: " + getAuthor() + " | ");
        System.out.print("Title: " + getTitle() + " | ");
        System.out.print("Publisher: " + getPublisher()+ " | ");
        System.out.print("Year of publication: " + getYearOfPublication()+ " | ");
        System.out.println("Author: " + getWriter().getFirstName() + " " + getWriter().getLastName() );
    }


}
