import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysFreeForYear = Integer.parseInt(scanner.nextLine()); // едно число – броят почивни дни – цяло число в интервала [0...365]

        int totalMinutesPlayed = numDaysFreeForYear*127 + (365-numDaysFreeForYear)*63;

        if(totalMinutesPlayed > 30000) {
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play\n", (totalMinutesPlayed-30000)/60, (totalMinutesPlayed-30000)%60 );
        } else {
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play\n", (30000-totalMinutesPlayed)/60, (30000-totalMinutesPlayed)%60 );
        }
    }
}
