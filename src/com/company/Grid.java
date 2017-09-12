package com.company;
import java.util.Random;
//delete import later

public class Grid {

    private Cell grid [][] = new Cell[5][5];
    private boolean cellStatus [][] = new boolean[5][5];

    public void initialFill(){
        Random rand = new Random();
        boolean alive;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                int  n = rand.nextInt(2);
                if(n==1){
                    alive = true;
                }
                else{
                    alive = false;
                }
                Cell cell = new Cell(alive);
                grid[r][c] = cell;
                cellStatus[r][c] = cell.cellState();
            }
        }
    }

    public void updateGrid(){
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; r++){
                if((grid[r][c].cellState() != grid[r+1][c].cellState()) || grid[r][c].cellState() != grid[r-1][c].cellState()){
                    grid[r][c].death();
                }
            }
        }
    }

    public boolean[][] returnGrid(){
        return cellStatus;
    }

}
