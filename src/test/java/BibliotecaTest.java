import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by egonzale on 3/1/17.
 */
public class BibliotecaTest {

    private PrintStream out;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);
    }



    @Test
    public void shouldPrintOutNamesOfBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", "1983", out));
        books.add(new Book("Green Eggs and Ham", "Dr. Suess", "1904", out));
        books.add(new Book("Sex at Dawn", "IDK", "1987", out));
        Biblioteca biblioteca = new Biblioteca(out, books);

        biblioteca.listBooks();

        verify(out).println(contains("1984"));
        verify(out).println(contains("Sex at Dawn"));
        verify(out).println(contains("Green Eggs and Ham"));
    }


}