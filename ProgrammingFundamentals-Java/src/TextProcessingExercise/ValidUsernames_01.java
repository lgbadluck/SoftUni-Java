package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        boolean isValidUser;
        for (String word : input) {
            if (word.length() < 3 || word.length() > 16) continue;
            isValidUser = true;
            for (char ch : word.toUpperCase().toCharArray()) {
                if (!(ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9' || ch == '-' || ch == '_')) {
                    isValidUser = false;
                    break;
                }
            }
            if (isValidUser)
                System.out.println(word);
        }
    }
}
