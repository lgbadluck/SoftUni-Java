package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decryptedMSG = "";

        while (n>0) {
            n--;
            String input = scanner.nextLine();
            char x = input.charAt(0);
            decryptedMSG = decryptedMSG + (char)(x+key);
        }
        System.out.println(decryptedMSG);
    }
}
