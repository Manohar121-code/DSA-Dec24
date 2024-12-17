package edu.dsa.bigO;

public class BigOEx {
    public static void main(String[] args) {
        int sum = sum(5, 3); //O(1)
        System.out.println(sum);//O(1)
        System.out.println("----------");//O(1)

        print(5); //O(n)

        System.out.println("-------");//O(1)

        printN2(10);//O(n2)

        System.out.println("---------");//O(1)

        printN3(10);//O(n3)
    }

    //O(1)
    public static int sum(int a, int b) {
        return a+b;
    }

    //O(n)
    public static void print(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //O(n) + O(n) = O(2N) = O(n)
    public static void print2N(int n) {
        for(int i = 1; i <= n; i++) { //O(n)
            System.out.println(i);
        }
        for(int j = 1; j <= n; j++) { //O(n)
            System.out.println(j);
        }
    }

    //O(n2)
    public static void printN2(int n) {
        for (int i = 1; i <= n ; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.println(i+" "+j);
            }
        }
    }

    //O(n2) + O(n) = O(n2 + n) = O(n2)
    public static void printN2N(int n) {
        for (int i = 1; i <= n ; i++) { //O(n2)
            for(int j = 1; j <= n; j++) {
                System.out.println(i+" "+j);
            }
        }

        for(int i = 1; i <= n; i++) { //O(n)
            System.out.println(i);
        }
    }

    //O(n3)
    public static void printN3(int n) {
        for (int i = 1; i <= n ; i++) {
            for(int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println(i+" "+j+" "+ k);
                }
            }
        }
    }

    //O(a*b)
    public static void printNAB(int a, int b) {
        for (int i = 1; i <= a ; i++) {
            for(int j = 1; j <= b; j++) {
                System.out.println(i+" "+j);
            }
        }
    }

    //O(a)+O(b) = O(a+b)
    public static void printNAPlusB(int a, int b) {
        for (int i = 1; i <= a ; i++) {//O(a)
            System.out.println(i);
        }
        for(int j = 1; j <= b; j++) {//O(b)
            System.out.println(j);
        }
    }
}
