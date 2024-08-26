package br.com.screenmatch.calculation;

import br.com.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public  int getTotalTime() {
        return totalTime;
    }

    public void include(Title title) {
        totalTime += title.getDurationMinutes();
    }
}
