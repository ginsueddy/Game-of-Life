package com.company;

public class Cell {
    private boolean alive;

    public Cell (boolean alive){
        this.alive = alive;
    }

    public void underPopulation (){
        this.alive = false;
    }

    public void overPopulation(){
        this.alive = false;
    }

    public void surrvive(){
        this.alive = true;
    }

    public void repopulate(){
        this.alive = true;
    }

}
