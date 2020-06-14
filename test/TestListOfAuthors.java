import Library.*;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.mockito.Mockito.*;

public class TestListOfAuthors {

    Library library;
    Book book1;
    Book book2;

    @Test
    public void testGetListOfAuhtors(){
        setUp();

        List<String> authorList;

        authorList = library.getListOfAuthors();
        Assertions.assertTrue(authorList.contains("Klaus"));
        Assertions.assertTrue(authorList.contains("Marie"));

        authorList = library.getListOfAuthors();
        Assertions.assertTrue(authorList.contains("Peter"));
        Assertions.assertTrue(authorList.contains("Anna"));

        authorList = library.getListOfAuthors();
        Assertions.assertTrue(authorList.contains("Hans"));
        Assertions.assertTrue(authorList.contains("Petra"));

        verify(book1, atMost(3)).getAuthor();
        verify(book2, atLeastOnce()).getAuthor();
    }

    public void setUp(){
        library = new Library();

        book1 = mock(Book.class);
        book2 = mock(Book.class);

        //Two different options for consecutive stubbing
        when(book1.getAuthor()).thenReturn("Klaus", "Peter", "Hans");
        when(book2.getAuthor()).thenReturn("Marie").thenReturn("Anna").thenReturn("Petra");

        library.addBook(book1);
        library.addBook(book2);
    }
}
