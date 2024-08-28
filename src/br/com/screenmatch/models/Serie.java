package br.com.screenmatch.models;

public class Serie extends Title {

    // Additional attributes specific to a Serie
    int seasons;
    int episodesSeason;
    boolean active;
    int minutesEpisode;

    /**
     * Main constructor for the Serie class. Inherits name and releaseDate from Title.
     *
     * @param name The name of the series.
     * @param releaseDate The year the series was released.
     */
    public Serie(String name, int releaseDate) {
        super(name, releaseDate); // Call the Title constructor to initialize inherited attributes
    }

    /**
     * Getter method to retrieve the number of seasons of the series.
     *
     * @return The number of seasons as an integer.
     */
    public int getSeasons() {
        return seasons;
    }

    /**
     * Setter method to update the number of seasons of the series.
     *
     * @param seasons The new number of seasons as an integer.
     */
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    /**
     * Getter method to retrieve the number of episodes per season of the series.
     *
     * @return The number of episodes per season as an integer.
     */
    public int getEpisodesSeason() {
        return episodesSeason;
    }

    /**
     * Setter method to update the number of episodes per season of the series.
     *
     * @param episodesSeason The new number of episodes per season as an integer.
     */
    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    /**
     * Getter method to check if the series is currently active (new episodes being produced).
     *
     * @return True if the series is active, false otherwise.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Setter method to update the active flag of the series.
     *
     * @param active True if the series is active, false otherwise.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Getter method to retrieve the duration of a single episode in minutes.
     *
     * @return The duration of an episode in minutes as an integer.
     */
    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    /**
     * Setter method to update the duration of a single episode in minutes.
     *
     * @param minutesEpisode The new duration of an episode in minutes as an integer.
     */
    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    /**
     * Overrides the getDurationMinutes() method from Title to calculate the total duration of the series in minutes.
     *
     * @return The total duration of the series in minutes as an integer.
     */
    @Override
    public int getDurationMinutes() {
        return seasons * episodesSeason * minutesEpisode;
    }

    /**
     * Overrides the toString() method from Object to provide a string representation of the Serie.
     *
     * @return A string containing the serie's name and release year.
     */
    @Override
    public String toString() {
        return "Série: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}