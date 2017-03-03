import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.*;

import static org.mockito.ArgumentMatchers.contains;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by egonzale on 3/2/17.
 */
public class BookTest {

    private PrintStream printStream;
    private Book book;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        book = new Book("1984", "George Orwell", "1983", printStream);
    }

    @Test
    public void shouldPrintTitleWhenPrintingDetails() {
        book.printDetails();

        verify(printStream).println(contains("1984"));
    }

    @Test
    public void shouldPrintAuthorWhenPrintingDetails() {
        book.printDetails();

        verify(printStream).println(contains("George Orwell"));
    }

    @Test
    public void shouldPrintYearWhenPrintingDetails() {
        book.printDetails();

        verify(printStream).println(contains("1983"));
    }

    @Test
    public void shouldPrintFormattedDetails() {
        book.printDetails();

        verify(printStream).println("1984 | George Orwell | 1983");
    }
}
