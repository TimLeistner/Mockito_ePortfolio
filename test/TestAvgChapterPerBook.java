import Library.*;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

public class TestAvgChapterPerBook {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Test
    public void testAvgChapterPerBook(){
        setup();

        Assertions.assertEquals(library.getAvgChaptersPerBook(), 12.75);

        reset(book1);
        reset(book2);

        Assertions.assertEquals(library.getAvgChaptersPerBook(), 6.25);
    }

    @Test
    public void testWithSpy(){
        setupWithSpy();

        Assertions.assertEquals(library.getAvgChaptersPerBook(), 4.5);

        //Stub overwrites normal object behaviour
        when(book1.getChapterNumber()).thenReturn(10);

        Assertions.assertEquals(library.getAvgChaptersPerBook(), 7);
    }

    public void setup(){
        library = new Library();

        book1 = mock(Book.class);
        book2 = mock(Book.class);
        book3 = mock(Book.class);
        book4 = mock(Book.class);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        when(book1.getChapterNumber()).thenReturn(12);
        when(book2.getChapterNumber()).thenReturn(14);
        when(book3.getChapterNumber()).thenReturn(17);
        when(book4.getChapterNumber()).thenReturn(8);
    }

    public void setupWithSpy(){
        library = new Library();

        book1 = spy(new Book("Klaus", 50, 5));
        book2 = spy(new Book("Nina", 80, 4));

        library.addBook(book1);
        library.addBook(book2);
    }
}
