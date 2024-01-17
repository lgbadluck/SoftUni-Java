package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSingleLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOfSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceOfSingleBelt = Double.parseDouble(scanner.nextLine());

        double totalPriceLightSaber = (countOfStudents + Math.ceil(countOfStudents*0.10) )  * priceOfSingleLightSaber;
        double totalPriceRobes = countOfStudents * priceOfSingleRobe;
        double totalPriceBelt = (countOfStudents - countOfStudents/6) * priceOfSingleBelt;

        double totalPrice = totalPriceBelt + totalPriceRobes + totalPriceLightSaber;

        //System.out.println(totalPriceLightSaber);
        //System.out.println(totalPriceRobes);
        //System.out.println(totalPriceBelt);
        //System.out.println(totalPrice);

        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", totalPrice );
        } else {
            System.out.printf("George Lucas will need %.2flv more.\n", totalPrice-amountOfMoney );
        }
     }
}
