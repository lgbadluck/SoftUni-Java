import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTVSeries = scanner.nextLine();
        int epLength = Integer.parseInt(scanner.nextLine());
        int timeOnBreak = Integer.parseInt(scanner.nextLine());

        double timeToEat = (double) timeOnBreak / 8.0;
        double timeToRest = (double) timeOnBreak / 4.0;
        double timeLeft =  timeOnBreak - timeToEat - timeToRest;


        if ( timeLeft >= epLength ) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.\n", nameTVSeries, (int)Math.ceil(timeLeft - epLength) );
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.\n", nameTVSeries, (int)Math.ceil(epLength - timeLeft) );
        }
    }
}
