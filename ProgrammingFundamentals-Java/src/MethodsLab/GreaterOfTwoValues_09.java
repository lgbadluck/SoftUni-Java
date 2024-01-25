package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int x1 = Integer.parseInt(scanner.nextLine());
                int x2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(x1, x2));
                break;
            case "char":
                char c1 = scanner.nextLine().charAt(0);
                char c2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(c1, c2));
                break;
            case "string":
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                System.out.println(getMax(s1, s2));
                break;
        }
    }

    public static int getMax(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else return num2;
    }

    public static char getMax(char char1, char char2) {
        if (char1 >= char2) {
            return char1;
        } else return char2;
    }

    public static String getMax(String string1, String string2) {
        if (string1.compareTo(string2) >= 0) {
            return string1;
        } else return string2;
    }

}
