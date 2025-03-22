package com.example.labaalty;

public class Countries {
    private String name;
    private String population;
    private int flagResId;

    public Countries(String name, String population, int flagResId) {
        this.name = name;
        this.population = population;
        this.flagResId = flagResId;
    }

    public String getName() {
        return name;
    }

    public String getPopulation() {
        return population;
    }

    public int getFlagResId() {
        return flagResId;
    }
}

