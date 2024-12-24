package edu.dsa.array;

public class TwoDimentionalArrayEx {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];//O(n*n) -> O(n2)

//        arr[2][1] = 10;
//
//        int k = arr[2][1];
//        System.out.println(k);

        //initialize
        int a = 1;
        //rows
        for(int i = 0; i < n; i++) {//O(n*n) -> O(n2)
            //cols
            for(int j = 0; j < n; j++) {
                arr[i][j] = a++;
            }
        }

        //reading
        //rows
        for(int i = 0; i < n; i++) {//O(n*n) -> O(n2)
            //cols
            for(int j = 0; j < n; j++) {
                int k = arr[i][j];
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
