import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaToGreen = Double.parseDouble(scanner.nextLine());
        double priceFull = areaToGreen * 7.61;
        double discount = priceFull * 0.18;
        double finalPrice = priceFull - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.\n", discount);
    }
}
