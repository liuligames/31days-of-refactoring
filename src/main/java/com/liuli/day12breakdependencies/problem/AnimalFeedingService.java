package com.liuli.day12breakdependencies.problem;

public class AnimalFeedingService {
    private boolean isBowlEmpty;

    public void feed() {
        if (isBowlEmpty) {
            Feeder.replenishFood();
        }
    }
}
