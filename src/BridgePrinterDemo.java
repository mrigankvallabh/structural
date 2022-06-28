import bridgeprinter.Book;
import bridgeprinter.BookPrinter;
import bridgeprinter.HTMLFormatter;
import bridgeprinter.Movie;
import bridgeprinter.MoviePrinter;
import bridgeprinter.PrintFormatter;
import bridgeprinter.Printer;

public class BridgePrinterDemo {
    public static void main(String[] args) {
        Movie m = new Movie("Dhund", "Suspense", 128, 1978);
        Printer mp = new MoviePrinter(m);
        System.out.println(mp.print(new HTMLFormatter()));

        Book b = new Book("Core Java Volume I", "S. Hortsmann", "xxxx xxxx xxxx xxxx", 12);
        Printer bp = new BookPrinter(b);
        System.out.println(bp.print(new PrintFormatter()));
    }
}
