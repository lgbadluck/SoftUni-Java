package MidExamPreparation;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodInGrams = Double.parseDouble(scanner.nextLine()) * 1000.0;
        double heyInGrams = Double.parseDouble(scanner.nextLine()) * 1000.0;
        double coverInGrams = Double.parseDouble(scanner.nextLine()) * 1000.0;
        double guineaPigInGrams = Double.parseDouble(scanner.nextLine()) * 1000.0;

        double foodPerDayGrams = 300.0;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= foodPerDayGrams;
            if (i % 2 == 0) {
                heyInGrams -= foodInGrams * 0.05;
            }
            if (i % 3 == 0) {
                coverInGrams -= guineaPigInGrams / 3;
            }
            if (foodInGrams <= 0 || heyInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.\n", foodInGrams / 1000, heyInGrams / 1000, coverInGrams / 1000);
    }
}
