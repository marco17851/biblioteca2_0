import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class MenuTest {

    private PrintStream out;
    private Menu menu;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);
        menu = new Menu(out);
    }

    @Test
    public void shouldPrintListOptionWhenDisplayingMenu() {
        menu.displayMenu();

        verify(out).println(contains("List Books"));
    }


}