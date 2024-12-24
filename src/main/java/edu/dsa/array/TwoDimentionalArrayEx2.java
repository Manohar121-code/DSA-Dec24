package edu.dsa.array;

public class TwoDimentionalArrayEx2 {
    public static void main(String[] args) {
        int row = 3;
        int col = 4;

        int[][] arr = new int[row][col];

        //initialize
        int a = 1;
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = a++;
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
