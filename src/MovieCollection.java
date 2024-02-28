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
            items.movieInfo();
        }
    }

    public ArrayList<Movie> searchMovie(String movieName){
        var foundMovies = new ArrayList<Movie>();
        for (Movie items : movieList){
            if (items.getTitle().toLowerCase().contains(movieName.toLowerCase())){
                foundMovies.add(items);
            }

        }
        if (foundMovies.isEmpty()){
            System.out.println("This film does not exist in the list.");
        } else{
            for (Movie items : foundMovies){
                items.movieInfo();
            }
        }
        return foundMovies;

    }
}



