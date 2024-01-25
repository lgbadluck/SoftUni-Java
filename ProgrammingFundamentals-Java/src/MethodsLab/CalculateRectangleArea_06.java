package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rectWidth = Double.parseDouble(scanner.nextLine());
        double rectLength = Double.parseDouble(scanner.nextLine());
        double rectArea = getRectArea(rectWidth, rectLength);

        System.out.println((int)rectArea);
    }

    public static double getRectArea (double width, double length)
    {
        return width*length;
    }
}
