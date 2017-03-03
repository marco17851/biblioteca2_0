import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Menu {
    private PrintStream out;

    public Menu(PrintStream out) {
        this.out = out;
    }

    public void displayMenu() {
        out.println("1. List Books");
    }
}
