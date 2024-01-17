import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        //Бюджет на групата – цяло число в интервала [1…8000]
        //Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        //Брой рибари – цяло число в интервала [4…18]
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFisherman = Integer.parseInt(scanner.nextLine());

        double moneyLeftOver    = 0.0;
        double discount         = 0.0;
        double shipPrice        = 0.0;

        //Цената зависи от сезона:
        //Цената за наем на кораба през пролетта е  3000 лв.
        //Цената за наем на кораба през лятото и есента е  4200 лв.
        //Цената за наем на кораба през зимата е  2600 лв.

        //В зависимост от броя си групата ползва отстъпка:
        //Ако групата е до 6 човека включително  –  отстъпка от 10%.
        //Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        //Ако групата е от 12 нагоре  –  отстъпка от 25%.
        switch (season) {
            case "Spring":
                shipPrice = 3000;
                if (numberOfFisherman <= 6) {
                    discount = shipPrice * 0.10;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    discount = shipPrice * 0.15;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 12) {
                    discount = shipPrice * 0.25;
                    shipPrice = shipPrice - discount;
                }
                if (numberOfFisherman %2 == 0) {
                    shipPrice = shipPrice - (shipPrice * 0.05);
                }
                break;
            case "Summer":
                shipPrice = 4200;
                if (numberOfFisherman <= 6) {
                    discount = shipPrice * 0.10;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    discount = shipPrice * 0.15;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 12) {
                    discount = shipPrice * 0.25;
                    shipPrice = shipPrice - discount;
                }
                if (numberOfFisherman %2 == 0) {
                    shipPrice = shipPrice - (shipPrice * 0.05);
                }
                break;
            case "Autumn":
                shipPrice = 4200;
                if (numberOfFisherman <= 6) {
                    discount = shipPrice * 0.10;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    discount = shipPrice * 0.15;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 12) {
                    discount = shipPrice * 0.25;
                    shipPrice = shipPrice - discount;
                }
                break;
            case "Winter":
                shipPrice = 2600;
                if (numberOfFisherman <= 6) {
                    discount = shipPrice * 0.10;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 7 && numberOfFisherman <= 11) {
                    discount = shipPrice * 0.15;
                    shipPrice = shipPrice - discount;
                } else if (numberOfFisherman > 12) {
                    discount = shipPrice * 0.25;
                    shipPrice = shipPrice - discount;
                }
                if (numberOfFisherman %2 == 0) {
                    shipPrice = shipPrice - (shipPrice * 0.05);
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        // Outputs
        //Ако бюджетът е достатъчен:
        //"Yes! You have {останалите пари} leva left."
        //Ако бюджетът НЕ Е достатъчен:
        //"Not enough money! You need {сумата, която не достига} leva."
        if (budget >= shipPrice) {
            moneyLeftOver = budget - shipPrice;
            System.out.printf("Yes! You have %.2f leva left.\n", moneyLeftOver);
        }  else {

            System.out.printf("Not enough money! You need %.2f leva.\n", (shipPrice - budget) );
        }
    }
}
