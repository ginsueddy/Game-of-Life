package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Grid g = new Grid();
        g.initialFill();
        Cell myGrid [][];
        while(true){
            System.out.println("------------------------------");
            myGrid = g.returnGrid();
            for(int r = 0; r < myGrid.length; r++){
                for(int c = 0; c < myGrid[r].length; c++){
                    if(myGrid[r][c].cellState()){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
            System.out.println("------------------------------");
            System.out.println();
            g.updateGrid();

        }

    }
}
