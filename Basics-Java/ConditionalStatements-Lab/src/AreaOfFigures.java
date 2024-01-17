import java.util.Scanner;

import static java.lang.Math.*;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double area = 0;

        if (shape.equals("square")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            area = sideA * sideA;
        } else if (shape.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * PI;
        } else if (shape.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = (sideA * sideB) / 2;
        }

        System.out.printf("%.3f\n", area);
    }
}