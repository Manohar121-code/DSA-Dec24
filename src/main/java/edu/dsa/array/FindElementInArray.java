package edu.dsa.array;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,7,8,1,5,9,6};
        int k = 5;

        //loop array elemnts
        //compare each element with k
        //if current element == k print yes and return
        //if not found print no

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("found at index - "+ i);
                return;
            }
        }
        System.out.println("not found");
    }
}
