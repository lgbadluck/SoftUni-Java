package DataTypesandVariablesLab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        String char3 = scanner.nextLine();

        String word = "";

        word = char1+char2+char3;

        System.out.println(word);
    }
}
