package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("END") ){
            //int num = Integer.parseInt(input);
            checkPalindromeInteger(input);
            input = scanner.nextLine();
        }
    }
    public static void checkPalindromeInteger(String n)
    {
        int len = n.length();
        for (int i = 0; i < len/2; i++) {
            char thisChar = n.charAt(i);
            char mirrorChar = n.charAt(len-1-i);
            if (thisChar!=mirrorChar) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
