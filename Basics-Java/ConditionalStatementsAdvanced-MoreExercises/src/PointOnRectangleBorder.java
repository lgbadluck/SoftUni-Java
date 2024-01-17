import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rectangleX1 = Double.parseDouble(scanner.nextLine());
        double rectangleY1 = Double.parseDouble(scanner.nextLine());
        double rectangleX2 = Double.parseDouble(scanner.nextLine());
        double rectangleY2 = Double.parseDouble(scanner.nextLine());
        double pointX = Double.parseDouble(scanner.nextLine());
        double pointY = Double.parseDouble(scanner.nextLine());

        if ( (pointX >= rectangleX1 && pointX <= rectangleX2) && (pointY >= rectangleY1 && pointY <= rectangleY2) ) {
            if (pointX==rectangleX1 || pointX==rectangleX2 || pointY==rectangleY1 || pointY==rectangleY2) {
                System.out.println("Border");
            } else System.out.println("Inside / Outside");
        } else System.out.println("Inside / Outside");

    }
}