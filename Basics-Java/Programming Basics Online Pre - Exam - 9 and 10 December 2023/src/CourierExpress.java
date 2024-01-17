import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и съдържа 3 реда:
        //1. Тегло на пратката в килограми – реално число в интервала [0.01 ... 150.00]
        //2. Тип услуга – текст със следните възможности: "standard" или "express"
        //3. Разстояние в километри – цяло число в интервала [1 ... 1000]

        double weightOfDelivery = Double.parseDouble(scanner.nextLine());
        String typeOfDelivery = scanner.nextLine();
        int distanceOfDelivery = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        switch (typeOfDelivery) {
            case "standard":
                if (weightOfDelivery<=1) {
                    totalPrice = 0.03*distanceOfDelivery;
                } else if (weightOfDelivery<10) {
                    totalPrice = 0.05*distanceOfDelivery;
                } else if (weightOfDelivery<40) {
                    totalPrice = 0.10*distanceOfDelivery;
                } else if (weightOfDelivery<90) {
                    totalPrice = 0.15*distanceOfDelivery;
                } else if (weightOfDelivery<=150) {
                    totalPrice = 0.20*distanceOfDelivery;
                }
                break;
            case "express":
                if (weightOfDelivery<=1) {
                    totalPrice = 0.03*distanceOfDelivery+0.80*0.03*weightOfDelivery*distanceOfDelivery;
                } else if (weightOfDelivery<10) {
                    totalPrice = 0.05*distanceOfDelivery+0.40*0.05*weightOfDelivery*distanceOfDelivery;
                } else if (weightOfDelivery<40) {
                    totalPrice = 0.10*distanceOfDelivery+0.05*0.10*weightOfDelivery*distanceOfDelivery;
                } else if (weightOfDelivery<90) {
                    totalPrice = 0.15*distanceOfDelivery+0.02*0.15*weightOfDelivery*distanceOfDelivery;
                } else if (weightOfDelivery<=150) {
                    totalPrice = 0.20*distanceOfDelivery+0.01*0.20*weightOfDelivery*distanceOfDelivery;
                }
                break;
            default:
                System.out.printf("Invalid input for typeOfDelivery= %s\n", typeOfDelivery);
                break;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.\n", weightOfDelivery, totalPrice);
    }
}
