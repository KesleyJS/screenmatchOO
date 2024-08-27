package br.com.screenmatch.models;

public class Title implements Comparable<Title>{
    String name;
    int releaseDate;
    boolean includedPlan;
    double ratingSum;
    int quantityRating;
    int durationMinutes;

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    int getQuantityRating(){
        return quantityRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Nome " + name);
        System.out.println("Ano de lançamento: " + releaseDate);
        System.out.println("Incluso no plano: " + includedPlan);
        System.out.println("Nota: " + ratingSum);
        System.out.println("Duração: " + durationMinutes + "min");
        System.out.println("Total de avaliações: " + quantityRating);
    }

    public void rate(double rate) {
        ratingSum += rate;
        quantityRating++;
    }

    public double getAverage(){
        return ratingSum / quantityRating;
    }

    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }
}
