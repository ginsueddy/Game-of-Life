package com.company;
import java.util.Arrays;
import java.util.Random;

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


    private int getNeighborCount(Cell[][] grid, int row, int column){
        int neighbors = 0;

        neighbors = checkRight(neighbors, grid, row, column);

        neighbors = checkLeft(neighbors, grid, row, column);

        neighbors = checkDown(neighbors, grid, row, column);

        neighbors = checkUp(neighbors, grid, row, column);

        neighbors = checkDownRight(neighbors, grid, row, column);

        neighbors = checkUpRight(neighbors, grid, row, column);

        neighbors = checkDownLeft(neighbors, grid, row, column);

        neighbors = checkUpLeft(neighbors, grid, row, column);

        return neighbors;
    }

    private int checkRight(int neighbors, Cell[][] grid, int row, int column){
        if(row == grid.length - 1){
            row = -1;
        }
        if(grid[row+1][column].cellState()){
            neighbors ++;
        }
        return neighbors;
    }

    private int checkLeft(int neighbors, Cell[][] grid, int row, int column){
        if(row == 0 ){
            row = grid.length;
        }
        if(grid[row-1][column].cellState()){
            neighbors ++;
        }
        return neighbors;
    }

    private int checkDown(int neighbors, Cell[][] grid, int row, int column){
        if(column == grid[row].length - 1){
            column = -1;
        }
        if(grid[row][column+1].cellState()){
            neighbors++;
        }
        return neighbors;
    }

    private int checkUp(int neighbors, Cell[][] grid, int row, int column){
        if(column == 0){
            column = grid[row].length;
        }
        if(grid[row][column-1].cellState()){
            neighbors++;
        }
        return neighbors;
    }

    private int checkDownRight(int neighbors, Cell[][] grid, int row, int column){
        if(column == grid[row].length - 1){
            column = -1;
        }

        if(row == grid.length - 1){
            row = -1;
        }

        if(grid[row+1][column+1].cellState()){
            neighbors++;
        }
        return neighbors;
    }


    private int checkUpRight(int neighbors, Cell[][] grid, int row, int column){
        if(column == grid[row].length-1){
            column = -1;
        }
        if(row == 0){
            row = grid.length;
        }
        if(grid[row-1][column+1].cellState()){
            neighbors++;
        }
        return neighbors;
    }

    private int checkDownLeft(int neighbors, Cell[][] grid, int row, int column){
        if(column == grid[row].length - 1){
            column = -1;
        }
        if(row == grid.length-1){
            row = -1;
        }
        if(grid[row+1][column+1].cellState()){
            neighbors++;
        }
        return neighbors;
    }

    private int checkUpLeft(int neighbors, Cell[][] grid, int row, int column){
        if(column == 0){
            column = grid[row].length;
        }
        if(row == 0){
            row = grid.length;
        }
        if(grid[row-1][column-1].cellState()){
            neighbors++;
        }
        return neighbors;
    }




    public void updateGrid(){
        Cell gridCopy[][] = grid;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                if(getNeighborCount(grid, r, c) < 2 || getNeighborCount(grid, r, c) > 3){
                    gridCopy[r][c].death();
                }
                else{
                    gridCopy[r][c].life();
                }
            }
        }
        for(int r = 0; r < gridCopy.length; r++){
            for(int c = 0; c < gridCopy[r].length; c++){
                cellStatus[r][c] = gridCopy[r][c].cellState();
            }
        }
    }

    public boolean[][] returnGrid(){
        return cellStatus;
    }

}
