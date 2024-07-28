package _08_ExceptionsAndErrorHandlingLab._02_SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        try {
            giveSquareRootOfNum(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Goodbye");
        }
    }

    private static void giveSquareRootOfNum(String input) {
        int rootOfInput;
        try {
            rootOfInput = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid");
        }
        if(rootOfInput < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        System.out.printf("%.2f\n", Math.sqrt(rootOfInput));
    }
}
