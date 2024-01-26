package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallestOf3(a,b,c));
    }
    public static int getSmallestOf3(int a, int b, int c)
    {
        int min = a;
        if(b<a) {
            if (c<b) min= c;
            else min=b;
        }
        else if (c<a) {
            if (c<b) min= c;
            else min=b;
        }
        return min;
    }
}
