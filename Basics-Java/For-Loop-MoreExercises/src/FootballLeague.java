import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());
        double fansInSectorA = 0;
        double fansInSectorB = 0;
        double fansInSectorV = 0;
        double fansInSectorG = 0;

        for (int i = 1; i <= numberOfFans; i++) {
            String fanIsFromSector = scanner.nextLine();
            switch (fanIsFromSector) {
                case "A":
                    fansInSectorA++;
                    break;
                case "B":
                    fansInSectorB++;
                    break;
                case "V":
                    fansInSectorV++;
                    break;
                case "G":
                    fansInSectorG++;
                    break;
                default:
                    System.out.printf("invalid sector\n");
                    break;
            }
        }

        System.out.printf("%.2f%%\n", fansInSectorA / numberOfFans * 100.0);
        System.out.printf("%.2f%%\n", fansInSectorB / numberOfFans * 100.0);
        System.out.printf("%.2f%%\n", fansInSectorV / numberOfFans * 100.0);
        System.out.printf("%.2f%%\n", fansInSectorG / numberOfFans * 100.0);
        System.out.printf("%.2f%%\n", (double) numberOfFans / capacityStadium * 100.0);

    }
}
