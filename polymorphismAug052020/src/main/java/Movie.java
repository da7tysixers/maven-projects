public class Movie {

    private String movieTitle;

    public Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String movieDescription(){
        return "No title assigned";
    }

    public String getMovieTitle() {
        return movieTitle;
    }
}
