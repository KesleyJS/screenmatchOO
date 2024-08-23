import models.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("The Hangover");
        movie.setReleaseYear(2010);
        movie.setDurationMinutes(96);

        movie.rate(10);
        movie.rate(3);
        movie.rate(1);
        movie.showInfo();
        System.out.println(movie.getAverage());
        movie.showInfo();


    }
}