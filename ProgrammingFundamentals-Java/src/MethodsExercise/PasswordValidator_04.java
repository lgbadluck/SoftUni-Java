package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        checkValidPassword(password);
    }

    public static void checkValidPassword(String password) {
        boolean isValid = true;
        int digitSum = 0;
        int len = password.length();

        if (len < 6 || len > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        for (int i = 0; i < len; i++) {
            char currChar = password.charAt(i);
            if (currChar >= '0' && currChar <= '9') digitSum++;
            //check if currChar is only Letter or Digit
            if (!((currChar >= 'a' && currChar <= 'z') || (currChar >= 'A' && currChar <= 'Z') || (currChar >= '0' && currChar <= '9'))) {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }

        if (digitSum < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        if (isValid) System.out.println("Password is valid");
    }
}
