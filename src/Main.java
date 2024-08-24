import models.Movie;
import models.Serie;

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

        Serie serie = new Serie();
        serie.setName("Stranger Things");
        serie.setReleaseYear(2018);
        serie.setSeasons(10);
        serie.setEpisodesSeason(10);
        serie.setMinutesEpisode(50);
        System.out.println("Tempo necessário para assistir a série: " + serie.getDurationMinutes());
        serie.showInfo();
    }
}