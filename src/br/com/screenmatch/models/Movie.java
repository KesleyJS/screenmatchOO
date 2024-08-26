package br.com.screenmatch.models;

import br.com.screenmatch.calculation.Rating;

public class Movie extends Title implements Rating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) getAverage() / 2;
    }
}
