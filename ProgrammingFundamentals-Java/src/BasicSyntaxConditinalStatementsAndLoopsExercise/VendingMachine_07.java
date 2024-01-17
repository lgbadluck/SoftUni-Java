package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your machine has, however, only:    "Nuts", "Water",   "Crisps", "Soda", "Coke".
        // The prices are:                       2.0,    0.7,       1.5,      0.8,    1.0

        String input = scanner.nextLine();
        double coinValue = 0.0;
        double totalMoney = 0.0;

        while (!input.equals("Start")) {
            coinValue = Double.parseDouble(input);
            if (coinValue == 0.1 || coinValue == 0.2 || coinValue == 0.5 || coinValue == 1 || coinValue == 2) {
                totalMoney+= coinValue;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinValue);
            }
            input = scanner.nextLine();
            if (input.equals("End")) break;
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (totalMoney >= 2.0 ) {
                        System.out.println("Purchased Nuts");
                        totalMoney-=2.0;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (totalMoney >= 0.7 ) {
                        System.out.println("Purchased Water");
                        totalMoney-=0.7;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (totalMoney >= 1.5 ) {
                        System.out.println("Purchased Crisps");
                        totalMoney-=1.5;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (totalMoney >= 0.8 ) {
                        System.out.println("Purchased Soda");
                        totalMoney-=0.8;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (totalMoney >= 1.0 ) {
                        System.out.println("Purchased Coke");
                        totalMoney-=1.0;
                    } else System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f\n", totalMoney);
    }
}
