package com.dd.examples;

import java.util.Scanner;

public class ToggleString {

    public static void main(String[] args) {
        // given String "Hello India!" --> "hELLO iNDIA!".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Word that need to toggle.");
        String str = scanner.nextLine();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            char charIs = str.charAt(i);
            if (charIs >= 'A' && charIs <= 'Z') {
                stb.append(Character.toLowerCase(charIs));
            } else if (charIs >= 'a' & charIs <= 'z') {
                stb.append(Character.toUpperCase(charIs));
            } else {
                stb.append(charIs);
            }

        }
        System.out.println("Toggeled Char is : " + stb);
    }

}
