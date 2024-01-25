package MethodsLab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        printGradeStr(grade);
    }
    public static void printGradeStr (double gradeNum)
    {
        String gradeStr = "";
        if (gradeNum >= 2.00 && gradeNum<=2.99) gradeStr = "Fail";
        else if (gradeNum >= 3.00 && gradeNum<=3.49) gradeStr = "Poor";
        else if (gradeNum >= 3.50 && gradeNum<=4.49) gradeStr = "Good";
        else if (gradeNum >= 4.50 && gradeNum<=5.49) gradeStr = "Very good";
        else if (gradeNum >= 5.50 && gradeNum<=6.00) gradeStr = "Excellent";

        System.out.println(gradeStr);
    }
}
