import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // menu controller variable
        int menuController ;
        // Create an instance of collection class
        MovieCollection myMovieList = new MovieCollection();
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Welcome to the film Collection you have two option: ");
        System.out.println("Choose 1 to add a new movie to the list. ");
        System.out.println("Choose 2 to exit the program.");
        // menu controller to add movies or exit
        menuController = scannerObject.nextInt();
        if (menuController == 2){
            System.out.println("You quit the program.");
        }
        // loop to add more movies
        while (menuController == 1)
        {
                System.out.println("Please add the title of the movie: ");
                scannerObject.nextLine();
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

            System.out.println("Click 1 to add another movie or click 2 to exit.");
            menuController = scannerObject.nextInt();

        }



        //shows items in the list
        myMovieList.showListItems();


   }
}




