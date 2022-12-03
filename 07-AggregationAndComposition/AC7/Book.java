package AC7;

import java.util.ArrayList;

public class Book {
    private Writer writer;
    private int numOfPages;
    private String title;
    private String category;
    private int currPage;
    private ArrayList<Chapter> chapterArray = new ArrayList<Chapter>();

    public Book(Writer writer, int numOfPages, String title, String category, int currPage) {
        this.writer = writer;
        this.numOfPages = numOfPages;
        this.title = title;
        this.category = category;
        this.currPage = currPage;
    }

    public String getTitle() {
        return title;
    }

    public void read(){

    }

    public void nextPage(){
        this.currPage ++;
    }

    public void prevPage(){
        this.currPage --;
    }

    public void goToPage(int page){
        this.currPage = page;
    }

    public void newChapter(String chapterName, int chapterNr){
        chapterArray.add(new Chapter(chapterName,chapterNr));
    }

    public void displayChapters(){
        for (Chapter chapter : chapterArray) {
            System.out.println(chapter.getTitle());
        }
    }
}

