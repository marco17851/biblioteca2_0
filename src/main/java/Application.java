import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Application {

    private BufferedReader in;
    private PrintStream out;
    private Biblioteca biblioteca;
    private Menu menu;

    public Application(BufferedReader in, PrintStream out, Biblioteca biblioteca, Menu menu){
        this.in = in;
        this.out = out;
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void start() {
        out.println("Welcome");
        menu.displayMenu();
        handleUserInput();
    }

    private void handleUserInput() {
        boolean invalidInput = !isMenuOption();
        if (invalidInput){
            invalidInput = !isMenuOption();
        }
    }

    private boolean isMenuOption() {
        try {
            String selection = in.readLine();
            if (selection != null && selection.equals("1")) {
                biblioteca.listBooks();
            } else if (selection != null) {
                out.println("Select a valid option!");
                return false;
            }
        } catch (IOException e) {

        }
        return true;
    }
}
