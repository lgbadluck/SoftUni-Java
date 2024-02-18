package MidExam_18_02_2024;

import java.util.Scanner;

public class BurgerBus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        int count = 0;

        while (count != numCities) {
            count++;

            String cityName = scanner.nextLine();
            double incomeThisCity = Double.parseDouble(scanner.nextLine());
            double expensesThisCity = Double.parseDouble(scanner.nextLine());

            if (count % 5 == 0) {
                expensesThisCity += incomeThisCity * 0.10; // In every 5th (fifth) city, it is raining, and the owner losses 10% of the money he earned
            } else if (count % 3 == 0) {
                expensesThisCity += expensesThisCity * 0.50; //Every 3rd (third) city the bus visits, the owner organizes a special event to ensure a true "Burger Bus" experience, spending an additional 50% over costs
            }
            double profitThisCity = incomeThisCity -expensesThisCity;
            totalProfit += profitThisCity;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityName, profitThisCity);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.\n", totalProfit);
    }
}
