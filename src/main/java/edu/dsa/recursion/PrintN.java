package edu.dsa.recursion;

public class PrintN {
    public static void main(String[] args) {
        printN(5);
        System.out.println("------------");
        printNRecursive(5);
    }

    private static void printN(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void printNRecursive(int n) {
        if(n == 0) {
            return;
        }
        printNRecursive(n-1);
        System.out.println(n);
    }
}
