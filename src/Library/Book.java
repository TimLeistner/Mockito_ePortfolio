package Library;

public class Book{
    private String author;
    private int pageNumber;
    private int chapterNumber;

    public Book(String author, int pageNumber, int chapterNumber){
        this.author = author;
        this.pageNumber = pageNumber;
        this.chapterNumber = chapterNumber;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public double averagePagesPerChapter(){
        return pageNumber/chapterNumber;
    }
}