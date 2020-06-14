import Library.*;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

public class TestSumOfPages {

    Library library;
    Book book1;

    @Test
    public void testSumOfPages(){
        setUp();

        Assertions.assertEquals(library.getSumOfPages(), 200);
    }

    private void setUp(){
        library = new Library();

        book1 = mock(Book.class);
        when(book1.getPageNumber()).thenReturn(200);

        library.addBook(book1);
    }
}
