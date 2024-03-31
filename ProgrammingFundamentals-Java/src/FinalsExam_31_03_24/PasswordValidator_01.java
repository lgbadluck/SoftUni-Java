package FinalsExam_31_03_24;

import java.util.Scanner;
import java.util.function.Predicate;

public class PasswordValidator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder password_SB = new StringBuilder(input);

        String command = scanner.nextLine();

        while (!command.equals("Complete")) {
            if (command.contains("Make Upper")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < password_SB.length()) {
                    char charToUpper = password_SB.charAt(index);
                    if (charToUpper >= 'a' && charToUpper <= 'z') {
                        charToUpper -= 'a' - 'A';
                    }
                    password_SB.replace(index, index + 1, String.valueOf(charToUpper));
                    System.out.println(password_SB.toString());
                }
            } else if (command.contains("Make Lower")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < password_SB.length()) {
                    char charToLower = password_SB.charAt(index);
                    if (charToLower >= 'A' && charToLower <= 'Z') {
                        charToLower += 'a' - 'A';
                    }

                    password_SB.replace(index, index + 1, String.valueOf(charToLower));
                    System.out.println(password_SB.toString());
                }
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                char charToInsert = command.split(" ")[2].charAt(0);
                //System.out.println("charToInsert: " + charToInsert);
                //System.out.println("index: " + index);

                if (index >= 0 && index < password_SB.length()) {
                    password_SB.insert(index, String.valueOf(charToInsert));
                    System.out.println(password_SB.toString());
                }
            } else if (command.contains("Replace")) {
                char charToReplace = command.split(" ")[1].charAt(0);
                int value = Integer.parseInt(command.split(" ")[2]);
                int sumASCII = charToReplace + value;

                //System.out.println("charToReplace: " + charToReplace + "=> as ASCII: " + (int)charToReplace);
                //System.out.println("value: " + value);
                //System.out.println("sumASCII: " + sumASCII + "=> as char: " + (char)sumASCII);

                String password = String.valueOf(password_SB);
                password_SB = new StringBuilder(password.replace(charToReplace, (char) sumASCII));
                System.out.println(password_SB.toString());

            } else if (command.contains("Validation")) {
                Predicate<StringBuilder> containsOnlyLettersDigitsOrUnderscores = sb -> sb.chars().allMatch(ch -> Character.isLetterOrDigit(ch) || ch == '_');
                if (password_SB.length() < 8)
                    System.out.println("Password must be at least 8 characters long!");
                if (!containsOnlyLettersDigitsOrUnderscores.test(password_SB) )
                    System.out.println("Password must consist only of letters, digits and _!");
                if (!password_SB.chars().anyMatch(Character::isUpperCase)) {
                    System.out.println("Password must consist at least one uppercase letter!");
                }
                if (!password_SB.chars().anyMatch(Character::isLowerCase)) {
                    System.out.println("Password must consist at least one lowercase letter!");
                }
                if (!password_SB.chars().anyMatch(Character::isDigit)) {
                    System.out.println("Password must consist at least one digit!");
                }
            }

            command = scanner.nextLine();
        }
    }
}
