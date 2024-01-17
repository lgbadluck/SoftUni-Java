package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        double totalRageExpenses = priceHeadset*(lostGamesCount/2) + priceMouse*(lostGamesCount/3) + priceKeyboard*(lostGamesCount/6)  + priceDisplay*(lostGamesCount/12);

        //System.out.println(priceHeadset*(lostGamesCount/2) );
        //System.out.println(priceMouse*(lostGamesCount/3) );
        //System.out.println(priceKeyboard*(lostGamesCount/6) );
        //System.out.println(priceDisplay*(lostGamesCount/12) );

        System.out.printf("Rage expenses: %.2f lv.\n", totalRageExpenses);
    }
}
