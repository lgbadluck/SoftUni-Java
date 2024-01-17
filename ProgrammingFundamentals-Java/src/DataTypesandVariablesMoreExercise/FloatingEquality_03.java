package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;


        if ( Math.abs(numberA-numberB)<1 && (Math.abs(numberA-numberB) < eps) ) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
