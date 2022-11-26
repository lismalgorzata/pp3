public class Books {
    private String name;
    private String author;
    private String releaseDate;
    private String genre;
    private boolean isOpen;
    private int pageCount;
    private int currentPage;

    public Books(String name, String author, String releaseDate, String genre, boolean isOpen, int pageCount) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.isOpen = isOpen;
        this.pageCount = pageCount;
        this.currentPage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void open(){
        isOpen=true;
    }

    public void close() {
        isOpen=false;
    }

    public int nextPage() {
        currentPage++;
        if (currentPage > pageCount) {
            currentPage = pageCount;
            System.out.println("The end");
        }
        return currentPage;
    }

    public int previousPage() {
        currentPage -- ;
        if (currentPage<=0) {
            currentPage = 0;
            System.out.println("U r at the beginning");
        }
        return currentPage;
    }


}
