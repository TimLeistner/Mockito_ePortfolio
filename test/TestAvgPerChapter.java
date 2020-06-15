import Library.*;
import org.junit.jupiter.api.*;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class TestAvgPerChapter {

    Library library;
    Book book1;
    Book book2;

    @Test
    public void testAvgPerChapter(){
        setUp();

        Assertions.assertEquals(library.getAvgPagesPerChapter(), 62.5);

        //Different usage of verification
        verify(book1, times(1)).averagePagesPerChapter();
        verify(book1, never()).getAuthor();
        verifyNoMoreInteractions(book1);

        //Usage of checking the order of function calls
        InOrder inOrder = inOrder(book1, book2);
        inOrder.verify(book1).averagePagesPerChapter();
        inOrder.verify(book2).averagePagesPerChapter();
    }

    public void setUp(){
        library = new Library();
        book1 = mock(Book.class);
        book2 = mock(Book.class);

        when(book1.averagePagesPerChapter()).thenReturn(50.0);
        when(book2.averagePagesPerChapter()).thenReturn(75.0);

        library.addBook(book1);
        library.addBook(book2);
    }
}
