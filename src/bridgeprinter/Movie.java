package bridgeprinter;

public class Movie {
    private final String title;
    private final String genre;
    private final int runtime;
    private final int year;
    
    public Movie(String title, String genre, int runtime, int year) {
        this.title = title;
        this.genre = genre;
        this.runtime = runtime;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", genre=" + genre + ", year=" + year + ", runtime=" + runtime + "]";
    }

}
