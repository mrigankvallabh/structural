package bridgeprinter;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
    
    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getTitle();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("genre", movie.getGenre()));
        details.add(new Detail("year", String.valueOf(movie.getYear())));
        details.add(new Detail("runtime", String.valueOf(movie.getRuntime())));

        return details;
    }

}
