package com.dd.examples;

public class FindMissingNumber {

    public static void main(String[] args) {
//       1) Find missing number
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16};
        missinNumber(n);
    }


    /**
     * 1) Find the missing number in sequence of numbers;
     * Sum= (n×(n+1)) / 2 ;
     */
    public static void missinNumber(int[] arrayNumbers) {
        int numberLength = arrayNumbers.length + 1;

        int expectedSum = numberLength * (numberLength + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            sum += arrayNumbers[i];
        }
        System.out.println("Missing Number is = " + (expectedSum - sum));
    }
}
