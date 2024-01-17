package DataTypesandVariablesLab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        String char3 = scanner.nextLine();

        String wordReversed = "";

        wordReversed = char3+" "+char2+" "+char1;
        System.out.println(wordReversed);
    }
}
