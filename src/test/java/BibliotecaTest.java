import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by egonzale on 3/1/17.
 */
public class BibliotecaTest {

    private PrintStream out;
    private ArrayList<Book> books;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {
        books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", "1983", out));
        books.add(new Book("Green Eggs and Ham", "Dr. Seuss", "1904", out));
        books.add(new Book("Sex at Dawn", "IDK", "1987", out));
        out = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
    }


    @Test
    public void shouldPrintOutNamesOfBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", "1983", out));
        books.add(new Book("Green Eggs and Ham", "Dr. Seuss", "1904", out));
        books.add(new Book("Sex at Dawn", "IDK", "1987", out));
        Biblioteca biblioteca = new Biblioteca(out, books);

        biblioteca.listBooks();

        verify(out).println(contains("1984"));
        verify(out).println(contains("Sex at Dawn"));
        verify(out).println(contains("Green Eggs and Ham"));
    }

    @Test
    public void shouldDeleteBookFromListWhenCheckingOutABook() {
        Book bookFour = new Book("", "", "", out);
        books.add(bookFour);
        Biblioteca biblioteca = new Biblioteca(out, books);

        biblioteca.checkOutBook("4");

        assertThat(books.contains(bookFour), is(false));
    }

    @Test
    public void shouldAlertUserOfSuccessfulCheckout() throws IOException {
        Book bookFour = new Book("", "", "", out);
        books.add(bookFour);
        Biblioteca biblioteca = new Biblioteca(out, books);

        biblioteca.checkOutBook("4");

        verify(out).println(contains("Thank you! Enjoy the book"));
    }
    
    @Test
    public void shouldAlertUserOfUnsuccessfulCheckout() {
        Biblioteca biblioteca = new Biblioteca(out, books);

        biblioteca.checkOutBook("4");
        verify(out).println(contains("That book is not available."));
    }

}