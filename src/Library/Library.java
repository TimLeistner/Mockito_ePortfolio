package Library;

import java.util.LinkedList;

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
}