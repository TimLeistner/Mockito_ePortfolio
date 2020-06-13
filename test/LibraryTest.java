import Library.*;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;


public class LibraryTest {

    Library library;
    Book book1;

    @Test
    public void test(){
        setUp();

        Mockito.when(book1.getPageNumber()).thenReturn(200);

        Assertions.assertEquals(library.getSumOfPages(), 200);
    }

    private void setUp(){
        library = new Library();
        book1 = mock(Book.class);

        library.addBook(book1);
    }
}
