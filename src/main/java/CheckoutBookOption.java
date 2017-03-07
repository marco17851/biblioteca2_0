import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by egonzale on 3/6/17.
 */
public class CheckoutBookOption implements Option {
    private String name;
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    public CheckoutBookOption(BufferedReader bufferedReader, Biblioteca biblioteca) {
        this.bufferedReader = bufferedReader;
        this.name = "Checkout Book";
        this.biblioteca = biblioteca;
    }

    public void execute() {
        String bookToCheckout = "-1";
        try {
            bookToCheckout = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        biblioteca.checkOutBook(Integer.parseInt(bookToCheckout));
    }

    public String getName() {
        return name;
    }
}
