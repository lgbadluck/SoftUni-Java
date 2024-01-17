package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sumTotal = 0.0;

        while (n!=0) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            System.out.printf("The price for the coffee is: $%.2f\n", ((daysInMonth * capsulesCount) * pricePerCapsule) );
            sumTotal+=((daysInMonth * capsulesCount) * pricePerCapsule);
            n--;
        }
        System.out.printf("Total: $%.2f\n", sumTotal);
    }
}
