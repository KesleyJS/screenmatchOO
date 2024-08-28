package br.com.screenmatch.models;

import br.com.screenmatch.exception.ConvertionErrorException;

public class Title implements Comparable<Title> {

    // Attributes representing information about a title (movie, show, etc.)
    String name;
    int releaseDate;
    boolean includedPlan;
    double ratingSum;
    int quantityRating;
    int durationMinutes;

    /**
     * Main constructor for the Title class.
     *
     * @param name The name of the title.
     * @param releaseDate The year the title was released.
     */
    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    /**
     * Constructor that creates a Title object from a TitleOmdb object (assuming it has relevant data).
     *
     * @param titleOmdb An object likely containing information about a title retrieved from an external source.
     */
    public Title(TitleOmdb titleOmdb) {
        if (titleOmdb.year() != null && titleOmdb.year().length() > 4) {
            throw new ConvertionErrorException("Não foi possível converter o ano " +
                    "pois ele possui mais de 4 caracteres");
        }
        this.name = titleOmdb.title();
        this.releaseDate = Integer.valueOf(titleOmdb.year());
        this.durationMinutes = Integer.valueOf(titleOmdb.runtime().substring(0, 2));
    }

    /**
     * Getter method to retrieve the title's name.
     *
     * @return The name of the title as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to retrieve the title's duration in minutes.
     *
     * @return The duration of the title in minutes as an integer.
     */
    public int getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Getter method to retrieve the sum of all ratings for the title.
     *
     * @return The total sum of ratings as a double.
     */
    public double getRatingSum() {
        return ratingSum;
    }

    /**
     * Getter method to check if the title is included in a specific plan.
     *
     * @return True if the title is included, false otherwise.
     */
    public boolean isIncludedPlan() {
        return includedPlan;
    }

    /**
     * Getter method to retrieve the title's release year.
     *
     * @return The release year of the title as an integer.
     */
    public int getReleaseDate() {
        return releaseDate;
    }

    /**
     * Setter method to update the title's release year.
     *
     * @param releaseDate The new release year as an integer.
     */
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Setter method to update the includedPlan flag.
     *
     * @param includedPlan True if the title is included, false otherwise.
     */
    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    /**
     * Setter method to update the title's duration in minutes.
     *
     * @param durationMinutes The new duration in minutes as an integer.
     */
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    /**
     * Getter method to retrieve the number of ratings received by the title.
     * (Note: Consider renaming this to `getNumberOfRatings` for clarity)
     *
     * @return The number of ratings as an integer.
     */
    public int getQuantityRating() {
        return quantityRating;
    }

    /**
     * Setter method to update the title's name.
     *
     * @param name The new name of the title as a String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to print information about the title to the console.
     */
    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + releaseDate);
        System.out.println("Incluso no plano: " + includedPlan);
        System.out.println("Nota: " + ratingSum);
        System.out.println("Duração: " + durationMinutes + "min");
        System.out.println("Total de avaliações: " + quantityRating);
    }

    /**
     * Method to add a rating to the title.
     *
     * @param rate The rating to be added (usually a value between 0 and 10).
     */
    public void rate(double rate) {
        ratingSum += rate;
        quantityRating++;
    }

    /**
     * Method to calculate the average rating of the title.
     *
     * @return The average rating as a double.
     */
    public double getAverage() {
        return ratingSum / quantityRating;
    }

    /**
     * Compares this title to another title based on their names.
     * This method is required for using this class in sorted collections.
     *
     * @param title The other title to compare to.
     * @return A negative integer, zero, or a positive integer as this title
     * is less than, equal to, or greater than the specified title.
     */
    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }

    /**
     * Provides a string representation of the title, useful for debugging and logging.
     *
     * @return A string containing the title's name and release year.
     */
    @Override
    public String toString() {
        return "(Nome: " + name + ", Ano de lançamento: " + releaseDate + ", Duração: " + durationMinutes + ")";
    }
}