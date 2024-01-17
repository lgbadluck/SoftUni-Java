import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numStandIns = Integer.parseInt(scanner.nextLine());
        double pricePerStandIn = Double.parseDouble(scanner.next());

        double decorPrice = budget * 0.1;
        double priceAllStandIns = numStandIns * pricePerStandIn;

        if (numStandIns > 150) {
            priceAllStandIns = priceAllStandIns - (priceAllStandIns * 0.1);
        }

        double finalPrice = decorPrice + priceAllStandIns;

        if (budget < finalPrice) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.\n", (finalPrice-budget) );
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.\n", (budget-finalPrice));
        }
    }
}
