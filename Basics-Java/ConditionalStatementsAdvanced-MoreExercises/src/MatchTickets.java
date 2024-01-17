import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()) ;
        String typeOfTickets = scanner.nextLine();
        int numSoccerFans = Integer.parseInt(scanner.nextLine());

        double priceToPay = 0;

        if (numSoccerFans>=1 && numSoccerFans<=4) {
            priceToPay = budget*0.75;
        } else if (numSoccerFans>=5 && numSoccerFans<=9) {
            priceToPay = budget*0.60;
        } else if (numSoccerFans>=10 && numSoccerFans<=24) {
            priceToPay = budget*0.50;
        } else if (numSoccerFans>=25 && numSoccerFans<=50) {
            priceToPay = budget*0.40;
        } else if (numSoccerFans>=50) {
            priceToPay = budget*0.25;
        }

        if (typeOfTickets.equals("VIP")) priceToPay+= numSoccerFans*499.99;
        if (typeOfTickets.equals("Normal")) priceToPay+= numSoccerFans*249.99;

        if(budget>=priceToPay) {
            System.out.printf("Yes! You have %.2f leva left.\n", budget-priceToPay);
        } else if(budget<priceToPay) {
            System.out.printf("Not enough money! You need %.2f leva.\n", priceToPay-budget);
        }
    }
}
