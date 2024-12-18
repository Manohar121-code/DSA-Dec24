package edu.dsa.bigO;

public class BigOSpaceComplexity {
    public static void main(String[] args) {
        createAndPrintArray();
        System.out.println("==============");
        createAndPrintArrayN2();
    }

//    n - 1
//    arr2 - n
//    i - 1
//    S(n) = 1 + n + 1 => O(n)
    public static void createAndPrintArray() {
        int n = 7;
//        int[] arr = new int[n];

        int[] arr2 = {2,6,3,8,7,4,1};
        //0 -> 6
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    //    n - 1
//    arr1 - n
//    arr2 = n
//    arr3 = n2
//    i = 1
//    j = 1
//    S(n) = n + n + n2 + 1 + 1 => 2n + n2 + 2 => n + n2 => O(n2)
    public static void createAndPrintArrayN2() {
        int n = 7;
        int[] arr1 = {3,5,7,8,9,1,2};

        int[] arr2 = {2,6,3,8,7,4,1};

        int[][] arr3 = new int[n][n];

        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr1[i]+ arr2[j];
                System.out.print(arr1[i]+ " "+arr2[j]+", ");
            }
            System.out.println();
        }
        System.out.println("--------");
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
