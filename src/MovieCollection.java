public class MovieCollection {
    private Movie[] movieList = new Movie[5];

    public void MovieCollection(Movie movie) {
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i] == null) {
                movieList[i] = movie;
                break;
            }
        }
    }

    public Movie[] getMovieList() {
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
