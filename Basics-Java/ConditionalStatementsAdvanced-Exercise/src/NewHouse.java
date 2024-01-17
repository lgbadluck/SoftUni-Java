import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //Брой цветя - цяло число в интервала [10…1000]
        //Бюджет - цяло число в интервала [50…2500]

        String flowerType = scanner.nextLine();
        int numberOfFlower = Integer.parseInt(scanner.nextLine());
        int moneyAtHand = Integer.parseInt(scanner.nextLine());
        double moneyLeftOver = 0.0;
        double moneyNeeded = 0.0;
        double discount = 0.0;

        switch (flowerType) {
            case "Roses":
                moneyNeeded = numberOfFlower * 5.00;
                if (numberOfFlower > 80) {
                    discount = moneyNeeded * 0.10;
                    moneyNeeded = moneyNeeded - discount;
                }
                break;
            case "Dahlias":
                moneyNeeded = numberOfFlower * 3.80;
                if (numberOfFlower > 90) {
                    discount = moneyNeeded * 0.15;
                    moneyNeeded = moneyNeeded - discount;
                }
                break;
            case "Tulips":
                moneyNeeded = numberOfFlower * 2.80;
                if (numberOfFlower > 80) {
                    discount = moneyNeeded * 0.15;
                    moneyNeeded = moneyNeeded - discount;
                }
                break;
            case "Narcissus":
                moneyNeeded = numberOfFlower * 3.00;
                if (numberOfFlower < 120) {
                    discount = moneyNeeded * 0.15;
                    moneyNeeded = moneyNeeded + discount;
                }
                break;
            case "Gladiolus":
                moneyNeeded = numberOfFlower * 2.50;
                if (numberOfFlower < 80) {
                    discount = moneyNeeded * 0.20;
                    moneyNeeded = moneyNeeded + discount;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        moneyLeftOver = moneyAtHand - moneyNeeded;
        if (moneyAtHand >= moneyNeeded) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.\n",
                    numberOfFlower, flowerType, moneyLeftOver);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.\n",
                    moneyNeeded - moneyAtHand);
        }
        //Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
    }
}
