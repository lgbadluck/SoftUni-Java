package _08_ExceptionsAndErrorHandlingLab._01_NumbersInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        System.out.println("Range: [" + start + "..." + end + "]");


        while (true) {
            String num = scanner.nextLine();
            try {
                isNumberInRange(start, end, num);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void isNumberInRange(int start, int end, String num) {
        int number;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid number: " + num, ex);
        }

        if (number <= end && number >= start) {
            System.out.println("Valid number: " + number);
        } else
            throw new IllegalArgumentException("Invalid number: " + number);
    }
}
