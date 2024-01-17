package DataTypesandVariableExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        double temp_sum = 0.0;
        String biggestModel = "";

        while (n>0) {
            n--;
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            temp_sum = Math.PI * radius * radius * height;
            if (temp_sum>sum) biggestModel = model;
            sum = temp_sum;
        }
        System.out.printf("%s\n", biggestModel);

    }
}
