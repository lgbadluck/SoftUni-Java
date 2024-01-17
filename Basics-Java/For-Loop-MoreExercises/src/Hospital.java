import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int sumTreated = 0;
        int sumUntreated = 0;
        int numDoctorCounter = 7;

        for (int i = 1; i <= numDays; i++) {
            if (i % 3 == 0 && (sumUntreated > sumTreated)) {
                numDoctorCounter++;
            }
            int numPatients = Integer.parseInt(scanner.nextLine());
            if (numPatients > numDoctorCounter) {
                sumTreated += numDoctorCounter;
                sumUntreated += numPatients - numDoctorCounter;
            } else {
                sumTreated += numPatients;
            }
        }
        System.out.printf("Treated patients: %d.\nUntreated patients: %d.\n", sumTreated, sumUntreated);

    }
}
