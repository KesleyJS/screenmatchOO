package br.com.screenmatch.calculation;

public class RecommendationFilter {
    public void filter(Rating rating) {
        if (rating.getRating() >= 4) {
            System.out.println("Está muito popular atualmente");
        } else if (rating.getRating() >= 2) {
            System.out.println("Muito bem avaliado atualmente");
        } else {
            System.out.println("Adicione na sua lista para assistir depois");
        }
    }
}
