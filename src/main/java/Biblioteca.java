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
    private final BufferedReader bufferedReader;

    public Biblioteca(PrintStream out, BufferedReader bufferedReader, ArrayList<Book> books) {
        this.out = out;
        this.books = books;
        this.bufferedReader = bufferedReader;
    }

    public void listBooks() {
        out.println("Title | Author | Year");
        for(Book book : books) {
            book.printDetails();
        }
    }


    public void checkOutBook(int choice) {
        //list books
        readLine();
        books.remove(choice - 1);
    }

    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
