package DataTypesandVariableExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        while (n > 0) {
            int input = Integer.parseInt(scanner.nextLine());
            n--;
            if (sum+input > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            } else sum += input;
        }

        System.out.printf("%d\n", sum);

    }
}
