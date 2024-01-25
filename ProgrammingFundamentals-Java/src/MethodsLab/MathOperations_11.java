package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format( calculate(num1, operation, num2) ) );
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            case "/":
                if (b == 0) {
                    System.out.printf("ERROR: Can't DIVIDE by Zero");
                } else {
                    return a / b;
                }
            case "*":
                return (a * b);
            default:
                System.out.println("ERROR: unknown operator");
                return result;
        }
    }
}
