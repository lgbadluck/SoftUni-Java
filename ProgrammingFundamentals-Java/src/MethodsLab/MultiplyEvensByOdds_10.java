package MethodsLab;

import java.util.Map;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(number));
    }
    public static int getMultipleOfEvensAndOdds(int n)
    {
        int evenSums = getSumOfEvenDigits(Math.abs(n));
        int oddSums = getSumOfOddDigits(Math.abs(n));

        return evenSums*oddSums;
    }
    public static int getSumOfEvenDigits (int num)
    {
        int evenSum = 0;
        while (num!=0) {
            int n = num%10;
            if (n%2==0) evenSum+=n;
            num/=10;
        }
        return evenSum;

    }
    public static int getSumOfOddDigits (int num)
    {
        int oddSum = 0;
        while (num!=0) {
            int n = num%10;
            if (n%2==1) oddSum+=n;
            num/=10;
        }
        return oddSum;

    }
}
