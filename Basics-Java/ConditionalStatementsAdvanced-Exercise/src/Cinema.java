import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double totalPriceAllSeatsSold = 0.0;

        switch (projectionType) {
            case "Premiere":
                totalPriceAllSeatsSold = rows * columns * 12.00;
                break;
            case "Normal":
                totalPriceAllSeatsSold = rows * columns * 7.50;
                break;
            case "Discount":
                totalPriceAllSeatsSold = rows * columns * 5.00;
                break;
            default:
                System.out.println("error");
                break;
        }
        if (totalPriceAllSeatsSold != 0.0) {System.out.printf("%.2f leva\n", totalPriceAllSeatsSold);}
    }
}
