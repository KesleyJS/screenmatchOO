package br.com.screenmatch.calculation;

import br.com.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public  int getTotalTime() {
        return totalTime;
    }

    public void include(Title title) {
        System.out.println("Adicionando Duração em minutos de " + title.getName());
        totalTime += title.getDurationMinutes();
    }
}
