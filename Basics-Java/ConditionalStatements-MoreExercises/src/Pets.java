import java.util.LinkedList;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysGone = Integer.parseInt(scanner.nextLine());
        int kilosFoodLeft = Integer.parseInt(scanner.nextLine());
        double dogKgFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catKgFoodPerDay = Double.parseDouble(scanner.nextLine());
        double tortoiseKgFoodPerDay = Double.parseDouble(scanner.nextLine());

        double petsKgFoodConsumed = numDaysGone*dogKgFoodPerDay + numDaysGone*catKgFoodPerDay + numDaysGone*(tortoiseKgFoodPerDay/1000.0);

        if (kilosFoodLeft>=petsKgFoodConsumed) {
            System.out.printf("%f kilos of food left.\n", Math.floor(kilosFoodLeft-petsKgFoodConsumed) );
        } else
            System.out.printf("%f more kilos needed.\n", Math.ceil(petsKgFoodConsumed-kilosFoodLeft) );
    }
}
