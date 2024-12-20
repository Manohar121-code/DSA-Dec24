package edu.dsa.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    //take 2 numbers 1 1
    //take sum variable
    //loop from 1 -> n-2
    //do n1+n2 and assign to sum
    //print sum
    //change the n1 and n2

    //1 1 2 3 5 8 13 21 34 55
    //n1 1
    //n2 1 -> n1
    //sum 2 -> n2
    private static void fibonacci(int n) {
        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1+" "+n2+" ");
        for (int i = 1; i <= n-2; i++) {
            sum = n1+n2;
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;
        }
    }
}
