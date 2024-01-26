package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printAllTopNumbers(n);
    }

    public static void printAllTopNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            if (isOddDigit(i) && isSumOfDigitsDivisibleBy8(i)) System.out.println(i);
        }
    }

    public static boolean isOddDigit(int num) {
        int n = 0;
        while (num != 0) {
            n = num % 10;
            if (n % 2 == 1) return true;
            num /= 10;
        }
        return false;
    }

    public static boolean isSumOfDigitsDivisibleBy8(int num) {
        int sum = 0;
        int n = 0;
        while (num != 0) {
            n = num % 10;
            sum += n;
            num /= 10;
        }
        if (sum % 8 == 0) return true;
        else return false;
    }
}
