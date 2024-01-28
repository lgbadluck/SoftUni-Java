package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();
        if (inputType.equals("int")) {
            int inputValue = Integer.parseInt(scanner.nextLine());
            printDataType(inputType, inputValue);
        }
        else if (inputType.equals("real")) {
            double inputValue = Double.parseDouble(scanner.nextLine());
            printDataType(inputType, inputValue);
        }
        else if (inputType.equals("string")) {
            String inputValue = scanner.nextLine();
            printDataType(inputType, inputValue);
        }
    }

    public static void printDataType(String param1, String param2) {
        System.out.println("$" + param2 + "$");
    }
    public static void printDataType(String param1, int param2) {
        System.out.println((param2*2));
    }
    public static void printDataType(String param1, double param2) {
        System.out.printf("%.2f\n", (param2*1.5));
    }
}
