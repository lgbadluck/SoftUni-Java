package _08_ExceptionsAndErrorHandlingLab._03_EnterNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        int start = 1;

        for (int i = 0; i < 10; i++) {
            // System.out.print("Enter integer number " + (i + 1) + ": ");
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input <= start || input >= 100) {
                    System.out.printf("Your number is not in range %d - 100!\n", start);
                    i--; // Retry input for invalid number
                } else {
                    numbers[i] = input;
                    start = input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number!");
                i--; // Retry input for non-integer value
            }
        }

        scanner.close();

        //System.out.print("Array elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
    }
}