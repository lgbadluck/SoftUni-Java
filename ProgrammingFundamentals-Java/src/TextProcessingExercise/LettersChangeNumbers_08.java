package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String code : codes) {
            double result = calculateCodeResult(code);
            sum += result;
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculateCodeResult(String code) {
        char letterBefore = code.charAt(0);
        double number = Double.parseDouble(code.substring(1, code.length() - 1));
        char letterAfter = code.charAt(code.length() - 1);

        //Before
        if (Character.isUpperCase(letterBefore)) {
            number /= letterBefore - 'A' + 1;
        } else {
            number *= letterBefore - 'a' + 1;
        }

        //After
        if (Character.isUpperCase(letterAfter)) {
            number -= letterAfter - 'A' + 1;
        } else {
            number += letterAfter - 'a' + 1;
        }

        return number;
    }
}
