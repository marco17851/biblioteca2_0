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
        processUserInput();
    }

    private void processUserInput() {
        int selection = selectedOption();
        while (selection < 1){
            out.println("Select a valid option!");
            selection = selectedOption();
        }
        if (selection == 1){
            biblioteca.listBooks();
        }
    }

    private int selectedOption() {
        try {
            String selection = in.readLine();
            if (selection != null && selection.equals("1") || selection.equals("2")){
                return Integer.parseInt(selection);
            } else if (selection != null) {
                return -1;
            }
        } catch (IOException e) {

        }
        return -1;
    }
}
