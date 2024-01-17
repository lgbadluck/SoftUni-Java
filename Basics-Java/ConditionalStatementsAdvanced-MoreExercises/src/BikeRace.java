import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCyclistJunior = Integer.parseInt(scanner.nextLine());
        int numCyclistSenior = Integer.parseInt(scanner.nextLine());
        String typeOfRace = scanner.nextLine();

        double moneyToDonate = 0;

        switch (typeOfRace) {
            case "trail":
                moneyToDonate = numCyclistSenior*7.0 + numCyclistJunior*5.50;
                break;
            case "cross-country":
                moneyToDonate = numCyclistSenior*9.5 + numCyclistJunior*8.0;
                if (numCyclistSenior+numCyclistJunior >= 50) {
                    moneyToDonate-=moneyToDonate*0.25;
                }
                break;
            case "downhill":
                moneyToDonate = numCyclistSenior*13.75 + numCyclistJunior*12.25;
                break;
            case "road":
                moneyToDonate = numCyclistSenior*21.50 + numCyclistJunior*20.0;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        // Deduct 5% for expenses
        moneyToDonate-=moneyToDonate*0.05;

        System.out.printf("%.2f\n", moneyToDonate);
    }
}
