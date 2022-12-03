package AC7;

public class Chapter {
    private String title;
    private int numOfPages;
    private int startingPageNr;

    public Chapter(String title, int numOfPages) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.startingPageNr = startingPageNr;
    }

    public Chapter(String title, int numOfPages, int startingPageNr) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.startingPageNr = startingPageNr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getStartingPageNr() {
        return startingPageNr;
    }

    public void setStartingPageNr(int startingPageNr) {
        this.startingPageNr = startingPageNr;
    }
}
