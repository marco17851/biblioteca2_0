import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by egonzale on 3/1/17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", "1983", System.out));
        books.add(new Book("Green Eggs and Ham", "Dr. Suess", "1904", System.out));
        books.add(new Book("Sex at Dawn", "IDK", "1987", System.out));
        Application app = new Application(new BufferedReader(new InputStreamReader(System.in)), System.out, new Biblioteca(System.out, books), new Menu(System.out));
        app.start();
    }
}
