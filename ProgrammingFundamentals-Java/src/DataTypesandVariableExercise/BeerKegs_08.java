package DataTypesandVariableExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double prev_sum = 0.0;
        String biggestModel = "";

        while (n>0) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double sum = Math.PI * radius * radius * height;
            if (sum > prev_sum) {
                biggestModel = model;
                prev_sum = sum;
            }
            n--;
        }
        System.out.printf("%s\n", biggestModel);

    }
}
