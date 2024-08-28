package br.com.screenmatch.models;

import br.com.screenmatch.calculation.Rating; // Assuming Rating is a relevant class

public class Episode implements Rating {

    // Attributes representing information about an episode
    private int number; // Episode number within the series
    private String name;
    private Serie serie; // Reference to the series the episode belongs to
    private int totalViews; // Total number of times the episode has been viewed

    /**
     * Getter method to retrieve the episode number within the series.
     *
     * @return The episode number as an integer.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method to update the episode number within the series.
     *
     * @param number The new episode number as an integer.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter method to retrieve the episode's name.
     *
     * @return The episode name as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update the episode's name.
     *
     * @param name The new episode name as a String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to retrieve the Serie object this episode belongs to.
     *
     * @return The Serie object representing the series.
     */
    public Serie getSerie() {
        return serie;
    }

    /**
     * Setter method to update the Serie object this episode belongs to.
     *
     * @param serie The Serie object representing the series.
     */
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    /**
     * Getter method to retrieve the total number of views for the episode.
     *
     * @return The total number of views as an integer.
     */
    public int getTotalViews() {
        return totalViews;
    }

    /**
     * Setter method to update the total number of views for the episode.
     *
     * @param totalViews The new total number of views as an integer.
     */
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    /**
     * Implements the getRating() method from the Rating interface.
     * This method assigns a simplified rating based on the total views:
     *  - 4 stars for episodes with more than 100 views
     *  - 2 stars for episodes with 100 or less views
     *
     * @return An integer representing the simplified rating of the episode.
     */
    @Override
    public int getRating() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}