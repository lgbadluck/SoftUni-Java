import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double amountOfFuel = Double.parseDouble(scanner.nextLine());

        switch (typeOfFuel) {
            case "Gasoline":
            case "Gas":
            case "Diesel":
                if (amountOfFuel >= 25) {
                    System.out.printf("You have enough %s.\n", typeOfFuel.toLowerCase());
                } else System.out.printf("Fill your tank with %s!\n", typeOfFuel.toLowerCase());
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }

    }
}
