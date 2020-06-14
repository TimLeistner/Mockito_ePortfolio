import Library.*;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class TestAvgPerChapter {

    Library library;

    @Mock
    Book book1;
    @Mock
    Book book2;

    @Test
    public void testAvgPerChapter(){
        setUp();

        Assertions.assertEquals(library.getAvgPagesPerChapter(), 62.5);

        verify(book1, times(1)).averagePagesPerChapter();
        verify(book1, never()).getAuthor();
        verifyNoMoreInteractions(book1);
    }

    public void setUp(){
        library = new Library();

        when(book1.averagePagesPerChapter()).thenReturn(50.0);
        when(book2.averagePagesPerChapter()).thenReturn(75.0);

        library.addBook(book1);
        library.addBook(book2);
    }
}
