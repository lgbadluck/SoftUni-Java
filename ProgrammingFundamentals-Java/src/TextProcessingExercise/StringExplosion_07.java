package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int explosionCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            char thisChar = input.charAt(i);

            if (thisChar != '>' && explosionCounter == 0) {
                System.out.print(thisChar);
            } else if (thisChar != '>' && explosionCounter > 0) {
                explosionCounter--;
            } else {
                System.out.print(thisChar);
                explosionCounter += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            }
        }
    }
}
