package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        getSignOfInt(num);
    }
    public static void getSignOfInt(int param1)
    {
        String sign = "";
        if(param1 > 0) sign = "positive";
        else if(param1<0) sign = "negative";
        else sign = "zero";

        System.out.printf("The number %d is %s.\n", param1, sign);
    }
}
