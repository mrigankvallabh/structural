package bridgeprinter;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {

    private final Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected String getHeader() {
        return book.getTitle();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("author", book.getAuthor()));
        details.add(new Detail("ISBN", book.getISBN()));
        details.add(new Detail("current edition", String.valueOf(book.getEdition())));
        return details;
    }

}
