package DataTypesandVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());

        double distanceInKM = distanceInMeters / 1000.0;

        System.out.printf("%.2f", distanceInKM);
    }
}
