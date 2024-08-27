package br.com.screenmatch.main;

import br.com.screenmatch.calculation.RecommendationFilter;
import br.com.screenmatch.calculation.TimeCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Hangover", 2010);
        movie.setDurationMinutes(96);

        movie.rate(10);
        movie.rate(3);
        movie.rate(1);
        movie.showInfo();
        System.out.println(movie.getAverage());
        movie.showInfo();

        Serie serie = new Serie("Stranger Things", 2018);
        serie.setSeasons(10);
        serie.setEpisodesSeason(10);
        serie.setMinutesEpisode(50);
        System.out.println("Tempo necessário para assistir a série: " + serie.getDurationMinutes());
        serie.showInfo();

        Movie movie1 = new Movie("Avatar", 2023);
        movie1.setDurationMinutes(180);

        Movie movie2 = new Movie("Deadpool", 2024);
        movie2.setDurationMinutes(120);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(movie);
        calculator.include(movie1);
        calculator.include(serie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setTotalViews(300);
        filter.filter(episode);

        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(movie);
        movieList.add(movie1);
        movieList.add(movie2);

        System.out.println(movieList);
        System.out.println("Quantidade de filmes " + movieList.size());
        System.out.println("Primeiro filme " + movieList.getFirst().getName());
        System.out.println("Último filme " + movieList.getLast().getName());
        System.out.println(movieList.getFirst().toString());
    }
}