package br.com.screenmatch.models;

import br.com.screenmatch.calculation.Rating; // Assuming Rating is a relevant class

public class Movie extends Title implements Rating {

    // Additional attribute specific to a Movie
    private String director;

    /**
     * Main constructor for the Movie class. Inherits name and releaseDate from Title.
     *
     * @param name The name of the movie.
     * @param releaseDate The year the movie was released.
     */
    public Movie(String name, int releaseDate) {
        super(name, releaseDate); // Call the Title constructor to initialize inherited attributes
    }

    /**
     * Getter method to retrieve the director's name.
     *
     * @return The director's name as a String.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Setter method to update the director's name.
     *
     * @param director The director's name as a String.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Implements the getRating() method from the Rating interface.
     * This method calculates a simplified rating by dividing the average rating by 2 (might need further logic based on your rating system).
     *
     * @return An integer representing the simplified rating of the movie.
     */
    @Override
    public int getRating() {
        return (int) getAverage() / 2; // Cast average to int for simplified rating
    }

    /**
     * Overrides the toString() method from Object to provide a string representation of the Movie.
     *
     * @return A string containing the movie's name and release year.
     */
    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}