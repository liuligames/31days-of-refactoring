package com.liuli.day8replaceinheritencewithdelegation.solution;

public class Child{

    private Sanitation sanitation;

    public Child() {
        sanitation = new Sanitation();
    }

    public String addSanitation(){
        return sanitation.addSanitation();
    }
}
