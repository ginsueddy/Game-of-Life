package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Grid g = new Grid();
        g.initialFill();
        boolean test [][] = g.returnGrid();
        for(int i = 0; i < 2; i++){
            System.out.println("******");
            for(int j = 0; j < test.length; j++){
                System.out.println(Arrays.toString(test[i]));
                System.out.println();
            }
            System.out.println("******");
        }

    }
}
