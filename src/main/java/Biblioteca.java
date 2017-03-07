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
        for(int x = 0; x < books.size(); x++) {
//            out.print((x+1) + ": ");
            books.get(x).printDetails();
        }
    }


    public void checkOutBook(String userChoice) {
        int choice = stringToInteger(userChoice);

        if(choice <= books.size() && choice > 0) {
            books.remove(choice - 1);
            out.println("Thank you! Enjoy the book");
        }
        else{
            out.println("That book is not available.");
        }
    }

    private int stringToInteger(String userChoice) {
        int choice;

        try {
            choice = Integer.parseInt(userChoice);
        } catch (NumberFormatException e){
            choice = -1;
        }

        return choice;
    }


}
