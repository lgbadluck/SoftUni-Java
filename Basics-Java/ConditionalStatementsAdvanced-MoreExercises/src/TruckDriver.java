import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double distanceToDriveKm = Double.parseDouble(scanner.nextLine());
        double moneyToReceive = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (distanceToDriveKm <= 5000) {
                    moneyToReceive = distanceToDriveKm*0.75;
                } else if (distanceToDriveKm <= 10000) {
                    moneyToReceive = distanceToDriveKm*0.95;
                } else if (distanceToDriveKm<=20000) {
                    moneyToReceive = distanceToDriveKm*1.45;
                }
                moneyToReceive*=4;
                break;
            case "Summer":
                if (distanceToDriveKm <= 5000) {
                    moneyToReceive = distanceToDriveKm*0.90;
                } else if (distanceToDriveKm <= 10000) {
                    moneyToReceive = distanceToDriveKm*1.10;
                } else if (distanceToDriveKm<=20000) {
                    moneyToReceive = distanceToDriveKm*1.45;
                }
                moneyToReceive*=4;
                break;
            case "Winter":
                if (distanceToDriveKm <= 5000) {
                    moneyToReceive = distanceToDriveKm*1.05;
                } else if (distanceToDriveKm <= 10000) {
                    moneyToReceive = distanceToDriveKm*1.25;
                } else if (distanceToDriveKm<=20000) {
                    moneyToReceive = distanceToDriveKm*1.45;
                }
                moneyToReceive*=4;
                break;
            default:
                System.out.println("error");
                break;
        }

        //10% taxes deducted from salary
        moneyToReceive-=moneyToReceive*0.10;
        System.out.printf("%.2f\n", moneyToReceive);
    }
}
