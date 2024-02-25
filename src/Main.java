import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MovieCollection myMovieList = new MovieCollection();
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please add the title of the movie: ");
        String title = scannerObject.nextLine();
        System.out.println("Please add the Director of the movie: ");
        String director = scannerObject.nextLine();
        System.out.println("Please add the genre of the movie: ");
        String genre = scannerObject.nextLine();
        System.out.println("Please add the year in which the movie published: ");
        int yearCreated = scannerObject.nextInt();
        System.out.println("Please add the length of the movie in minutes: ");
        int lengthInMinutes = scannerObject.nextInt();
        System.out.println("If it is a black and white movie type true else type false : ");
        boolean coloredMovie = scannerObject.nextBoolean();

        Movie myFavoriteMovie = new Movie(title, director, genre, yearCreated, lengthInMinutes, coloredMovie);
        myMovieList.MovieCollection(myFavoriteMovie);
        myMovieList.showListItems();


    }
}


