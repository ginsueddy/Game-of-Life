package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Grid g = new Grid();
        g.initialFill();
        boolean myGrid [][];
        for(int i = 0; i < 3; i++){
            System.out.println("******");
            myGrid = g.returnGrid();
            for(int j = 0; j < myGrid.length; j++){
                System.out.println(Arrays.toString(myGrid[j]));
            }
            System.out.println("******");
            System.out.println();
            g.updateGrid();

        }

    }
}
