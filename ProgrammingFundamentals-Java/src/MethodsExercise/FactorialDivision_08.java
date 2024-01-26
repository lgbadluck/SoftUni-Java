package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f\n", getFactorialDivision(num1,num2));
    }
    public static double getFactorialDivision(int n1, int n2)
    {
        return getFactorial(n1)/getFactorial(n2);
    }
    public static double getFactorial(int numToFact)
    {
        double result=1;
        for (int i = 2; i <= numToFact; i++) {
            result*=i;
        }
        return result;
    }
}
