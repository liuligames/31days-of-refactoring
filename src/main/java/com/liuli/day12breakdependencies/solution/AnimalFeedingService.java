package com.liuli.day12breakdependencies.solution;

public class AnimalFeedingService {
    private FeederService feederService;

    public AnimalFeedingService(FeederService feederService) {
        this.feederService = feederService;
    }

    public boolean isBowlEmpty;

    public void feed() {
        if (isBowlEmpty) {
            feederService.replenishFood();
        }
    }
}
