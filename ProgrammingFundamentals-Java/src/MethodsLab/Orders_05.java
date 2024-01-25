package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfProduct = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        getPrice(nameOfProduct, amount);
    }
    public static void getPrice(String productName, int quantity)
    {
        double price = 0.0;
        switch (productName) {
            case "coffee": price = 1.50; break;
            case "water": price = 1.00; break;
            case "coke": price = 1.40; break;
            case "snacks": price = 2.00; break;
            default:
                System.out.println("ERROR: no such productName");
                break;
        }
        System.out.printf("%.2f\n", price*quantity);
    }
}
