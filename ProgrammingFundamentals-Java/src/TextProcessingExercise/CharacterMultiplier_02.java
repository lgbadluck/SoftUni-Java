package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input  = scanner.nextLine().split(" ");

        int minLength = Math.min(input[0].length(), input[1].length());

        int sumCharCodes = 0;
        for (int i = 0; i < minLength; i++) {
            sumCharCodes+=input[0].charAt(i) * input[1].charAt(i);
        }

        if (input[0].length() > minLength) {
            for (int i = minLength; i < input[0].length(); i++) {
                sumCharCodes+=input[0].charAt(i);
            }
        } else {
            for (int i = minLength; i < input[1].length(); i++) {
                sumCharCodes+=input[1].charAt(i);
            }
        }
        System.out.println(sumCharCodes);
    }
}
