package com.liuli.day12breakdependencies.solution;


public class FeederServiceImpl implements FeederService {

    @Override
    public void replenishFood() {
        Feeder.replenishFood();
    }
}
