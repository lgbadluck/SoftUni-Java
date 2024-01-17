import java.util.Scanner;

public class FueldTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double amountToFill = Double.parseDouble(scanner.nextLine());
        String hasDiscountCard = scanner.nextLine();

        double priceToPay = 0;

        switch (typeOfFuel) {
            case "Gasoline":
                priceToPay = amountToFill * 2.22;
                if (hasDiscountCard.equals("Yes")) {
                    priceToPay -= amountToFill*0.18;
                }
                break;
            case "Diesel":
                priceToPay = amountToFill * 2.33;
                if (hasDiscountCard.equals("Yes")) {
                    priceToPay -= amountToFill*0.12;
                }
                break;
            case "Gas":
                priceToPay = amountToFill * 0.93;
                if (hasDiscountCard.equals("Yes")) {
                    priceToPay -= amountToFill*0.08;
                }
                break;
            default:
                System.out.print("Invalid fuel!\n");
                break;
        }

            if (amountToFill>20 && amountToFill<=25) {
                priceToPay -= priceToPay*0.08;
            } else if (amountToFill>25) {
                priceToPay -= priceToPay*0.10;
            }


        System.out.printf("%.2f lv.\n", priceToPay);
    }
}
