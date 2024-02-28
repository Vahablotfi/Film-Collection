
public class Movie {
    private String title;
    private String director;
    private String genre;
    private int yearCreated;
    private int lengthInMinutes;
    private boolean isInColor;


    public Movie(String title, String director, String genre, int yearCreated, int lengthInMinutes, boolean isInColor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.yearCreated = yearCreated;
        this.lengthInMinutes = lengthInMinutes;
        this.isInColor = isInColor;
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public boolean isInColor() {
        return isInColor;
    }

    public void movieInfo(){
        String coloredMovie = (isInColor) ? "Yes" : "No";
        System.out.println(
                "Movie Title: "+ title +"\n"+
                "Movie Director: "+director +"\n"+
                "Year of Publish: "+ yearCreated +"\n"+
                "Colored Movie: "+coloredMovie +"\n"+
                "Length in minutes: "+ lengthInMinutes+"\n"+
                "Genre: "+genre+"\n"
                 );
    }


}
