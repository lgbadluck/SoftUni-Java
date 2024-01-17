import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFish1 = Double.parseDouble(scanner.nextLine()); // Skumria
        double priceFish2 = Double.parseDouble(scanner.nextLine()); // Caca
        double amountKgFish3 = Double.parseDouble(scanner.nextLine());
        double amountKgFish4 = Double.parseDouble(scanner.nextLine());
        int amountKgClams = Integer.parseInt(scanner.nextLine());

        // Palamud price 160% more than Skumria
        double priceFish3 = priceFish1 *1.6;
        // Safrid price 180% more than Caca
        double priceFish4 = priceFish2 *1.8;
        double priceClams = 7.50;

        double  sum = priceFish3*amountKgFish3 + priceFish4*amountKgFish4 + priceClams*amountKgClams;

        System.out.printf("%.2f", sum);
    }
}
