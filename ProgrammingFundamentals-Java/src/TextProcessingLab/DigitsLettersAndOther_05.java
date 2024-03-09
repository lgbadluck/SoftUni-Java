package TextProcessingLab;

import java.util.Arrays;
import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[][] separated = new char[3][input.length()];

        int countDigit = 0;
        int countLetter = 0;
        int countOther = 0;

        for (char symbol : input.toCharArray()) {
            if(Character.isDigit(symbol))
                separated[0][countDigit++]=symbol;
            else if (Character.isLetter(symbol))
                separated[1][countLetter++]=symbol;
            else
                separated[2][countOther++]=symbol;
        }

        System.out.println(Arrays.deepToString(separated).trim()
                .replace("], ","\n")
                .replace("[","")
                .replace("]","")
                .replace(", ","")
                .replace("\0","")
        );
    }
}
