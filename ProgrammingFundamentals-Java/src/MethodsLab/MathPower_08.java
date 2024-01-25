package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format( mathPower(number, power) ) );
    }

    public static double mathPower(double num, int pow) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result*=num;
        }
        return result;
    }
}
