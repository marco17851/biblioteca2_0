/**
 * Created by egonzale on 3/6/17.
 */
public class ListBookOption implements Option {
    private final String name;
    private final Biblioteca biblioteca;

    public ListBookOption(Biblioteca biblioteca) {
        this.name = "List Books";
        this.biblioteca = biblioteca;
    }

    public void execute() {
        biblioteca.listBooks();
    }

    public String getName() {
        return name;
    }
}
