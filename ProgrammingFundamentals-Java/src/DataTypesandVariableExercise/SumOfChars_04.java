package DataTypesandVariableExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (n>0) {
            String input = scanner.nextLine();
            char x = input.charAt(0);
            sum += (int) x;
            n--;
        }

        System.out.printf("The sum equals: %d\n", sum);
    }
}
