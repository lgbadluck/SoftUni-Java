package MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getProductSignOf3(num1,num2,num3));
    }
    public static String getProductSignOf3(int n1, int n2, int n3) {
        String result = "";
        int countMinuses = 0;
        if ( n1==0 || n2==0 || n3==0) result = "zero";
        else {
            if (n1 < 0) countMinuses++;
            if (n2 < 0) countMinuses++;
            if (n3 < 0) countMinuses++;

            if (countMinuses%2 == 0) result = "positive";
            else result = "negative";
        }
        return result;
    }
}
