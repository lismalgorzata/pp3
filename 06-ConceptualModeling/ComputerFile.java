public class ComputerFile {
    private String name;
    private int size;
    private String creationDate;
    private String author;

    public ComputerFile(String name, int size, String creationDate, String author) {
        this.name = name;
        this.size = size;
        this.creationDate = creationDate;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
