import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class ApplicationTest {

    private PrintStream out;
    private Biblioteca biblioteca;
    private Menu menu;
    private BufferedReader in;
    private Application app;

    @Before
    public void setUp() throws IOException {
        out = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = mock(Menu.class);
        in = mock(BufferedReader.class);
        when(in.readLine()).thenReturn("1");
        app = new Application(out, menu);
    }
    @Test
    public void shouldPrintWelcomeMessageWhenApplicationStarts() {
        app.start();
        verify(out).println("Welcome");
    }

    @Test
    public void shouldChooseOptionWhenStarting() {
        app.start();

        verify(menu).chooseOption();
    }
}