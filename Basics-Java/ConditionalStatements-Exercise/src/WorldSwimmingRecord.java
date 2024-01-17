import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double lengthOfRecord = Double.parseDouble(scanner.nextLine());
        double speedOfSwimming = Double.parseDouble(scanner.nextLine());

        double timeTotal = lengthOfRecord*speedOfSwimming;
        int numOfSlowing = (int) lengthOfRecord/15;

        double timeAddedSlow = numOfSlowing * 12.5;

        if (recordInSeconds > (timeTotal + timeAddedSlow) ) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.\n", (timeAddedSlow + timeTotal));
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.\n", ((timeAddedSlow+timeTotal) - recordInSeconds) );
        }
    }
}
