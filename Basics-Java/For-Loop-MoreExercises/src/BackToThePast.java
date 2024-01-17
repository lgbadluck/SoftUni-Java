import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyInherited = Double.parseDouble(scanner.nextLine());
        int yearToLiveTo = Integer.parseInt(scanner.nextLine());
        int ageCounter = 18;
        int yearTraveledTo = 1800;
        double yearlyExpenses = 12000.0;

        for (int i=yearTraveledTo; i<=yearToLiveTo; i++) {
            if(i%2==0) {
                moneyInherited-=yearlyExpenses;
            }
            else {
                moneyInherited-=yearlyExpenses + (ageCounter*50);
            }
            ageCounter++;
        }

        if (moneyInherited>=0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.\n", moneyInherited);
        } else System.out.printf("He will need %.2f dollars to survive.\n", Math.abs(moneyInherited));
    }
}
