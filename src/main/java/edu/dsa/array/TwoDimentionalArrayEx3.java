package edu.dsa.array;

import java.util.Scanner;

public class TwoDimentionalArrayEx3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("please enter row size");
        int row = scr.nextInt();
        System.out.println("please enter col size");
        int col = scr.nextInt();

        int[][] arr = new int[row][col];

        //initialize
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter value for "+ i +" "+ j);
                arr[i][j] = scr.nextInt();
            }
        }

        //reading
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
