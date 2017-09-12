package com.company;

public class Cell {
    private boolean alive;

    public Cell (boolean alive){
        this.alive = alive;
    }

    public void death (){
        this.alive = false;
    }

    public void life(){
        this.alive = true;
    }

    public boolean cellState(){
        return alive;
    }

}
