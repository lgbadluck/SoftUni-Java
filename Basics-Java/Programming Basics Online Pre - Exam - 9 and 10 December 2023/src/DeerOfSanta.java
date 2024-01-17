import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат пет реда:
        // Първи ред – брой дни, в които Дядо Коледа отсъства – цяло число в интервала [1…5000]
        // Втори ред – оставена храна в килограми – цяло число в интервала [0…100000]
        // Трети ред – храна на ден за първия елен в килограми – реално число в интервала [0.00…100.00]
        // Четвърти ред – храна на ден за втория елен в килограми– реално число в интервала [0.00…100.00]
        // Пети ред – храна на ден за третия елен в килограми – реално число в интервала [0.00…100.00]
        int numberOfDaysGone = Integer.parseInt(scanner.next());
        int amountFoodLeftInKGs = Integer.parseInt(scanner.next());
        double foodEatenPerDayDeer1 = Double.parseDouble(scanner.next());
        double foodEatenPerDayDeer2 = Double.parseDouble(scanner.next());
        double foodEatenPerDayDeer3 = Double.parseDouble(scanner.next());

        double totalFoodEaten = numberOfDaysGone*(foodEatenPerDayDeer1+foodEatenPerDayDeer2+foodEatenPerDayDeer3);

        //На конзолата трябва да се отпечата на един ред:
        // Ако оставената храна Е достатъчна:
        //o “{килограми, които остават} kilos of food left.”
        // Резултатът трябва да е закръглен към ПО-МАЛКОТО цяло число
        // Ако оставената храна НЕ Е достатъчна:
        //o “{килограми, които не недостигат} more kilos of food are needed.”
        // Резултатът трябва да е закръглен към ПО-ГОЛЯМОТО цяло число
        if(totalFoodEaten<=amountFoodLeftInKGs) {
            System.out.printf("%.0f kilos of food left.\n", Math.floor(amountFoodLeftInKGs-totalFoodEaten) );
        } else System.out.printf("%.0f more kilos of food are needed.\n", Math.ceil(totalFoodEaten-amountFoodLeftInKGs) );
    }
}
