import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by egonzale on 3/1/17.
 */
public class Biblioteca {
    private PrintStream out;
    private ArrayList<Book> books;

    public Biblioteca(PrintStream out, ArrayList<Book> books) {
        this.out = out;
        this.books = books;
    }



    public void listBooks() {
        out.println("Title | Author | Year");
        for(Book book : books) {
            book.printDetails();
        }
    }



}
