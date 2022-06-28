package bridgeprinter;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private int edition = 1;

    public Book(String title, String author, String iSBN, int edition) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

}
