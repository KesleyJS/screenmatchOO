package br.com.screenmatch.main;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Movie movie = new Movie("The Hangover", 2010);
        movie.rate(10);
        Movie movie1 = new Movie("Avatar", 2023);
        movie1.rate(8);
        Movie movie2 = new Movie("Deadpool", 2024);
        movie2.rate(4);

        Serie serie = new Serie("Stranger Things", 2018);

        List<Title> list = new LinkedList<>();
        list.add(movie);
        list.add(movie1);
        list.add(movie2);
        list.add(serie);

        for (Title item: list) {
            System.out.println(item);
            if (item instanceof Movie movieItem && movieItem.getRating() > 2) {
                System.out.println("Classificação: " + movieItem.getRating());
            }
        }

        System.out.println();
        ArrayList<String> getByArtist = new ArrayList<>();
        getByArtist.add("Robert Downey Junior");
        getByArtist.add("Chris Evans");
        getByArtist.add("Mark Rufallo");

        System.out.println();
        System.out.println("Lista de artistas");
        System.out.println(getByArtist);

        System.out.println();
        Collections.sort(list);
        System.out.println("Lista ordenada por ordem alfabética");
        System.out.println(list);

        System.out.println();
        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Lista ordenada por ano de lançamento");
        System.out.println(list);
    }
}
