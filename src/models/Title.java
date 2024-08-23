package models;

public class Title {
    String name;
    int releaseYear;
    boolean includedPlan;
    double ratingSum;
    int quantityRating;
    int durationMinutes;

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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
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
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Incluso no plano: " + includedPlan);
        System.out.println("Nota: " + ratingSum);
        System.out.println("Duração do filme: " + durationMinutes + "min");
        System.out.println("Total de avaliações: " + quantityRating);
    }

    public void rate(double rate) {
        ratingSum += rate;
        quantityRating++;
    }

    public double getAverage(){
        return ratingSum / quantityRating;
    }
}
