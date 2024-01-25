package MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add": add(num1,num2); break;
            case "subtract": subtract(num1,num2); break;
            case "multiply": multiply(num1,num2); break;
            case "divide": divide(num1,num2); break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void add (int numA, int numB)
    {
        System.out.println(numA+numB);
    }
    public static void subtract (int numA, int numB)
    {
        System.out.println(numA-numB);
    }
    public static void multiply (int numA, int numB)
    {
        System.out.println(numA*numB);
    }
    public static void divide (int numA, int numB)
    {
        System.out.println(numA/numB);
    }
}
