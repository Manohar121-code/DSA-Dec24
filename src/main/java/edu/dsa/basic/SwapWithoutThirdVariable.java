package edu.dsa.basic;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a+b; //a =15 b = 5
        b = a-b;//a = 15 b = 10
        a = a-b;//a= 5 b = 10
        System.out.println(a);
        System.out.println(b);
    }
}
