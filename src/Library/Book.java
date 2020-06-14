package Library;

public class Book{
    private String title;
    private String author;
    private int pageNumber;
    private int chapterNumber;

    public Book(String title, String author, int pageNumber, int chapterNumber){
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.chapterNumber = chapterNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public double averagePagesPerChapter(){
        return pageNumber/chapterNumber;
    }
}