import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickens = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickensPrice = chickens * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;

        double allMealPrice = chickensPrice + fishPrice + vegetarianPrice;
        double desertPrice = allMealPrice * 0.2;

        double totalPriceWithDelivery = allMealPrice + desertPrice + 2.50;

        System.out.println(totalPriceWithDelivery);
    }
}
