import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        checkoutBookOption = new CheckoutBookOption("", biblioteca);
    }

    @Test
    public void shouldAllowUserToCheckoutABookOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("");

        checkoutBookOption.execute();

        verify(biblioteca).checkOutBook(anyInt());
    }

}