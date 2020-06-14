package Library;

import java.util.LinkedList;
import java.util.List;

public class Library{
    LinkedList<Book> bookList;

    public Library(){
        bookList = new LinkedList<Book>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public int getSumOfPages(){
        int sum = 0;

        for(Book book:bookList) {
            sum += book.getPageNumber();
        }

        return sum;
    }

    public double getAvgChaptersPerBook(){
        double result = 0;

        for(Book book:bookList){
            result += book.getChapterNumber();
        }
        result = result/bookList.size();

        return result;
    }

    public double getAvgPagesPerChapter(){
        double result = 0;

        for(Book book:bookList){
            result += book.averagePagesPerChapter();
        }
        result = result/bookList.size();

        return result;
    }

    public List<String> getListOfAuthors(){
        LinkedList<String> authors = new LinkedList<String>();

        for(Book book:bookList){
            authors.add(book.getAuthor());
        }

        return authors;
    }
}