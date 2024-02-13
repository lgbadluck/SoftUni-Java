package MidExamPreparation;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int plunderEachDay = Integer.parseInt(scanner.nextLine());
        double targetPlunderAmount = Double.parseDouble(scanner.nextLine());

        double collectedPlunderAmount = 0;
        for (int i = 1; i <= numDays; i++) {
            collectedPlunderAmount += plunderEachDay;
            if (i % 3 == 0) {
                collectedPlunderAmount += plunderEachDay * 0.5;
            }
            if (i % 5 == 0) {
                collectedPlunderAmount -= collectedPlunderAmount * 0.3;
            }
        }
        if (collectedPlunderAmount >= targetPlunderAmount) {
            System.out.printf("Ahoy! %.2f plunder gained.\n", collectedPlunderAmount);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.\n", collectedPlunderAmount / targetPlunderAmount * 100.0);
        }
    }
}
