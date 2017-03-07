import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

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


    public void checkOutBook(int choice) {
        books.remove(choice - 1);
    }

}
