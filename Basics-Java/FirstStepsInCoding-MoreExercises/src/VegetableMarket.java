import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKgVeggies = Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits = Double.parseDouble(scanner.nextLine());
        int yieldVeggies = Integer.parseInt(scanner.nextLine());
        int yieldFruits = Integer.parseInt(scanner.nextLine());

        double sum = pricePerKgVeggies*yieldVeggies + pricePerKgFruits*yieldFruits;
        System.out.printf("%.2f", sum/1.94);
    }
}
