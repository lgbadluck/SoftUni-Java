package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length()-1; i++) {
            char thisChar = input.charAt(i);
            char nextChar = input.charAt(i+1);

            if(thisChar != nextChar) {
                System.out.print(thisChar);
            }
            if(i == input.length()-2 && thisChar != nextChar) {
                System.out.print(nextChar);
            }
            if(i == input.length()-2 && thisChar == nextChar) {
                System.out.print(nextChar);
            }
        }
    }
}
