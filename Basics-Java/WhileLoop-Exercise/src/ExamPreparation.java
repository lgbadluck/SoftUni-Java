import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        int badStreak = Integer.parseInt(scanner.nextLine());
        int countBadStreak = 0;
        int grade;
        String input = scanner.nextLine();
        String nameProblem = input;

        while ( !input.equals("Enough") ) {
            grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countBadStreak++;
            }
            if (countBadStreak>= badStreak) {
                System.out.printf("You need a break, %d poor grades.\n", countBadStreak);
                break;
            }
            count++;
            sum += grade;
            nameProblem = input;
            input = scanner.nextLine();
        }
        if (countBadStreak < badStreak) System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s\n", sum/count, count, nameProblem);

    }
}
