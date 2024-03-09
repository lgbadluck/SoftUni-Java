package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for(char ch : input.toCharArray()) {
            char encryptedChar = (char) (ch + 3);
            System.out.print(encryptedChar);
        }
    }
}
