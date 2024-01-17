import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine()); // Height of Walls - green paint
        double y = Double.parseDouble(scanner.nextLine()); // Length of Walls - green paint
        double h = Double.parseDouble(scanner.nextLine()); // Height of Roof - red paint

        double squareAreaPer1LitrePaint_RED = 4.3;
        double squareAreaPer1LitrePaint_GREEN = 3.4;
        double sumLitresRed = 0.0;
        double sumLitresGreen = 0.0;

        sumLitresRed = ( 2*(x*y) + 2*(x*h/2) ) / squareAreaPer1LitrePaint_RED;
        sumLitresGreen = ( 2*x*x - 1.2*2 + 2*(x*y - 1.5*1.5) ) / squareAreaPer1LitrePaint_GREEN;

        System.out.printf("%.2f\n%.2f", sumLitresGreen, sumLitresRed);
    }
}
