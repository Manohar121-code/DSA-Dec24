package edu.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        int res = 1;
        int n = 5;
        for(int i = n ; i >= 1; i--) {
            res = res * i;
        }
        System.out.println(res);

        //1*5 =5 //res=5
        //5*4=20 //res=20
        //20*3=60 //res=60
        //60*2=120 //res=120
        //120*1=120 //res=120
        //return 120;
    }
}
