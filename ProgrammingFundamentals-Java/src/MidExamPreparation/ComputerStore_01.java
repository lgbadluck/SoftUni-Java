package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double priceCurrentPart = Double.parseDouble(input);
            if (priceCurrentPart < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPrice+=priceCurrentPart;
            input = scanner.nextLine();
        }

        if (totalPrice== 0) {
            System.out.println("Invalid order!");
            return;
        }

        double taxes = totalPrice*0.20;
        double finalTotalPrice = totalPrice+taxes;

        if(input.equals("special")) {
            finalTotalPrice*=0.90;
        }

        System.out.printf("Congratulations you've just bought a new computer!\n" +
                "Price without taxes: %.2f$\n" +
                "Taxes: %.2f$\n" +
                "-----------\n" +
                "Total price: %.2f$", totalPrice, taxes, finalTotalPrice);
    }
}
