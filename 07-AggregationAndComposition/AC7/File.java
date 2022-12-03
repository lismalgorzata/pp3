package AC7;

public class File {
    private String name;
    private String author;
    private int size;

    public File(String name, String author, int size) {
        this.name = name;
        this.author = author;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
