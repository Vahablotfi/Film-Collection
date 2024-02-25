import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movieList = new ArrayList<Movie>();

    public void MovieCollection(Movie movie) {
        movieList.add(movie);
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void showListItems() {
        for (Movie items : movieList) {
            if (items != null) {

                System.out.println(items.getTitle()
                        + " is a " + items.getLengthInMinutes()
                        + " minutes long movie. And was created in "
                        + items.getYearCreated() + " by " + items.getDirector());
            }
        }
    }
}
