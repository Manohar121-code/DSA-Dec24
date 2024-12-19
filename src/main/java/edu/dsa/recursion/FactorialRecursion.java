package edu.dsa.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial5(n);
        System.out.println(factorial);
    }

//    5*4*3*2*1
//    5*4*
    private static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    //i->6 n=0   0*f(-1)

    //i->5 n=1   1*f(0)     1*1=1 -> f(1)=1
    //i->4 n=2   2*f(1)     2*1=2 -> f(2)=2
    //i->3 n=3   3*f(2)     3*2=6 -> f(3)=6
    //i->2 n=4   4*f(3)     4*6=24 ->f(4)=24
    //i->1 n=5   5*f(4)     5*24=120-> f(5)=120

    private static int factorial5(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial4(n-1);//5*24=120
    }

    private static int factorial4(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial3(n-1);//4*6=24
    }

    private static int factorial3(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial2(n-1); //3*2=6
    }

    private static int factorial2(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial1(n-1);//2*1=2
    }

    private static int factorial1(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial0(n-1); //1*1=1
    }

    private static int factorial0(int n) {
        if(n == 0) {
            return 1;
        }
        return 1;
    }
}
