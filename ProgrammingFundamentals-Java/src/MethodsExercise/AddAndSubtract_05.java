package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(addAndSubtract(a,b,c));
    }
    public static int sum (int a, int b)
    {
        return a+b;
    }
    public static int subtract (int a, int b)
    {
        return a-b;
    }
    public static int addAndSubtract (int a, int b, int c)
    {
        return subtract(sum(a,b),c);
    }
}
