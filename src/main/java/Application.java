import java.io.PrintStream;

/**
 * Created by alexandraquintano on 3/2/17.
 */
public class Application {

    private PrintStream out;
    private Menu menu;

    public Application(PrintStream out, Menu menu){
        this.out = out;
        this.menu = menu;
    }

    public void start() {
        out.println("Welcome");
        menu.chooseOption();
    }

}
