import java.util.Scanner;

public class SuppliesForSchool {

    private static final double PricePencil = 5.80;
    private static final double PriceMarkers = 7.20;
    private static final double PriceCleanerPerLitre = 1.20;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencilsNum = Integer.parseInt(scanner.nextLine());
        int markersNum = Integer.parseInt(scanner.nextLine());
        int litresCleaner = Integer.parseInt(scanner.nextLine());
        double discountPrcnt = Double.parseDouble(scanner.nextLine());

        double total = pencilsNum*PricePencil + markersNum*PriceMarkers + litresCleaner*PriceCleanerPerLitre;
        double dscntAmount = total * discountPrcnt / 100;
        double finalPrice = total - dscntAmount;

        System.out.println(finalPrice);
    }

}
