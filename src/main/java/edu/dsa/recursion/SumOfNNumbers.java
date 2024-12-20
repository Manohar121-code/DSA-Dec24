package edu.dsa.recursion;

public class SumOfNNumbers {
    //1+2+3+4+5
    public static void main(String[] args) {//1+n+1 + 1+n+1 = 4+2n = n -> O(n)
        int n = 5;//O(1)
        int sum = sum(n);//O(n)
        System.out.println(sum);//O(1)

        System.out.println("---------");//O(1)

        int sum2 = sumByRecursion(n);//O(n)
        System.out.println(sum2);//O(1)
    }

    private static int sumByRecursion(int n) {//O(n)
        if (n == 0) {
            return 0;
        }
        int sumFromNextIteration = sumByRecursion(n-1);
        return sumFromNextIteration + n;
    }

    //take sum variable
    //loop elements from 1 to n
    //add current number to sum
    //assign the sum to sum itself in each iteration
    private static int sum(int n) {//1+n+n+1 -> 2+2n -> 2n -> n -> O(n)
        int sum = 0;//O(1)
        for(int i = 1; i <= n; i++) {//O(n)
            sum = sum+i;//O(n)
        }
        return sum;//O(1)
    }
}
