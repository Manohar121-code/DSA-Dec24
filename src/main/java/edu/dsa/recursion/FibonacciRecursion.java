package edu.dsa.recursion;

public class FibonacciRecursion {
    static int n1 = 1;
    static int n2 = 1;
    static int sum = 0;
    public static void main(String[] args) {
        System.out.print(n1+" "+n2+" "); //O(1)
        int n = 10; //O(1)
        fibonacci(n-2);//O(n)
    }
    //1 1 2 3 5 8 13 21 34 55
    private static void fibonacci(int n) { //O(n)
        if (n == 0) {
            return;
        }
        sum = n1+n2;
        System.out.print(sum+" ");
        n1 = n2;
        n2 = sum;
        fibonacci(n-1);
    }
}
