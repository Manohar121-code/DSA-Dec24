package edu.dsa.array;

public class Array2Ex {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("-------------");

        int[] arr2 = new int[n];
        int h = 10;
        //initialize the array
        for(int i = 0; i < arr2.length; i++) {
            arr[i] = h;
            h = h+10;
        }

        //read the array
        for(int i = 0; i < arr2.length; i++) {
            int value = arr[i];
            System.out.println(value);
        }
    }
}
