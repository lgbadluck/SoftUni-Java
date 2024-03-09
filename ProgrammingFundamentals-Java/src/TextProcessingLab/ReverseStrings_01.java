package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            char[] charArray = input.toCharArray();
            System.out.print(input + " = ");
            for (int i = input.length() - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
            System.out.println();

            input = scanner.nextLine();
        }

    }
}
