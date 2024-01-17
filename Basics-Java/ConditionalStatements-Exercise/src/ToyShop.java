import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacPrice = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numTalkingDolls = Integer.parseInt(scanner.nextLine());
        int numTeddyBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());

        int totalNumToys = numMinions + numTalkingDolls + numTrucks + numTeddyBears + numPuzzles;
        double priceAllToys = numMinions*8.20 + numTalkingDolls*3.00 + numTrucks*2.00 + numTeddyBears*4.10 + numPuzzles*2.60;
        double priceOfDiscount = 0;

        if (totalNumToys >= 50) {
            priceOfDiscount = 0.25 * priceAllToys;
        }

        double finalPrice = (priceAllToys - priceOfDiscount) * 0.9;

        if (finalPrice >= vacPrice) {
            System.out.printf("Yes! %.2f lv left.\n", (finalPrice - vacPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.\n", (vacPrice - finalPrice));
        }
    }
}
