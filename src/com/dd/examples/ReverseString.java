package com.dd.examples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Word that need to Reverse.");
        String str = scanner.nextLine();
        reverseString(str);
    }


    /*
    2) Reverse the given String with/without using String build in methods.
    ex : ABCS -> SCBA.
     */
    private static void reverseString(String givenString) {
        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = givenString.toCharArray();
//        if (!givenString.isEmpty()) {
//            for (int i = chars.length - 1; i >= 0; i--) {
//                stringBuilder.append(chars[i]);
//            }
//            System.out.println("Reversed String is : " + stringBuilder);
//        } else {
//
//            System.out.println("String is empty");
//        }

        if (!givenString.isEmpty()) {
            for (int i = givenString.length() - 1; i >= 0; i--) {
                char charAt = givenString.charAt(i);
                stringBuilder.append(charAt);
            }
            System.out.println("Reversed String is : " + stringBuilder);
        } else {

            System.out.println("String is empty");
        }
    }
}
