import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.contains;

/**
 * Created by egonzale on 3/6/17.
 */
public class CheckoutBookOptionTest {

    private BufferedReader bufferedReader;
    private Biblioteca biblioteca;
    private Option checkoutBookOption;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        biblioteca = mock(Biblioteca.class);
        checkoutBookOption = new CheckoutBookOption(bufferedReader, biblioteca);
    }

    @Test
    public void shouldAllowUserToCheckoutABookOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");

        checkoutBookOption.execute();

        verify(biblioteca).checkOutBook(anyString());
    }

    @Test
    public void shouldAllowUserToCheckoutThirdBookFromList() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        checkoutBookOption.execute();

        verify(biblioteca).checkOutBook("3");
    }


}