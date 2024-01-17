import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numVideoCards = Integer.parseInt(scanner.nextLine());
        int numProcessors = Integer.parseInt(scanner.nextLine());
        int numRamSticks = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = numVideoCards * 250;
        double priceProcessors = (priceVideoCards*0.35) * numProcessors;
        double priceRamSticks = (priceVideoCards*0.10) * numRamSticks;

        double totalPrice = priceVideoCards + priceProcessors + priceRamSticks;
        double discount = 0;

        if (numVideoCards > numProcessors) {
            discount = totalPrice * 0.15;
        }
        totalPrice = totalPrice - discount;

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!\n", (budget - totalPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!\n", (totalPrice - budget));
        }
    }
}
