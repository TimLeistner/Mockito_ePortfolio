import Library.*;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;

public class TestAvgPerChapter {

    Library library;
    Book book1;
    Book book2;

    @Test
    public void testAvgPerChapter(){
        setUp();

        Assertions.assertEquals(library.getAvgPagesPerChapter(), 62.5);

        Mockito.verify(book1, Mockito.times(1)).averagePagesPerChapter();
        Mockito.verify(book1, Mockito.never()).getAuthor();
        Mockito.verifyNoMoreInteractions(book1);
    }

    public void setUp(){
        library = new Library();
        book1 = Mockito.mock(Book.class);
        book2 = Mockito.mock(Book.class);

        Mockito.when(book1.averagePagesPerChapter()).thenReturn(50.0);
        Mockito.when(book2.averagePagesPerChapter()).thenReturn(75.0);

        library.addBook(book1);
        library.addBook(book2);
    }
}
