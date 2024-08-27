package br.com.screenmatch.models;

import br.com.screenmatch.calculation.Rating;

public class Serie extends Title implements Rating {

    int seasons;
    int episodesSeason;
    boolean active;
    int minutesEpisode;

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getDurationMinutes() {
        return seasons * episodesSeason * minutesEpisode;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
