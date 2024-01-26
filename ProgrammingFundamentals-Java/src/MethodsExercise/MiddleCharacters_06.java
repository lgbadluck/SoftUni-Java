package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChars(input);
    }

    public static void printMiddleChars(String inputStr) {
        int len =inputStr.length();
        if (len% 2 == 0) {
            System.out.printf("%c%c",inputStr.charAt(len/2-1), inputStr.charAt(len/2));
        } else {
            System.out.println(inputStr.charAt(len/2));
        }
    }
}
