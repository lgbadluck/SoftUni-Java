import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int numHoursPerDay = Integer.parseInt(scanner.nextLine());
        double sumTotal = 0.0;

        for (int day=1; day<=numDays; day++) {
            double sumDay =0.0;
            for (int hour=1; hour<=numHoursPerDay; hour++) {
                if (day%2==0 && hour%2==1) sumDay+=2.50;
                else if (day%2==1 && hour%2==0) sumDay+=1.25;
                else sumDay+=1.00;
            }
            System.out.printf("Day: %d - %.2f leva\n", day, sumDay);
            sumTotal+=sumDay;
        }
        System.out.printf("Total: %.2f leva\n", sumTotal);
    }
}
