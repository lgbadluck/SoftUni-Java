import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTurnsToPlay = Integer.parseInt(scanner.nextLine());
        double sumScoredPoints = 0;
        double counterInterval1 = 0;
        double counterInterval2 = 0;
        double counterInterval3 = 0;
        double counterInterval4 = 0;
        double counterInterval5 = 0;
        double counterIntervalInvalids = 0;

        for (int i = 1; i <= numTurnsToPlay; i++) {
            int numberThisTurn = Integer.parseInt(scanner.nextLine());
            if (numberThisTurn >= 0 && numberThisTurn <= 9) {
                counterInterval1++;
                sumScoredPoints += numberThisTurn * 0.20;
            } else if (numberThisTurn >= 10 && numberThisTurn <= 19) {
                counterInterval2++;
                sumScoredPoints += numberThisTurn * 0.30;
            } else if (numberThisTurn >= 20 && numberThisTurn <= 29) {
                counterInterval3++;
                sumScoredPoints += numberThisTurn * 0.40;
            } else if (numberThisTurn >= 30 && numberThisTurn <= 39) {
                counterInterval4++;
                sumScoredPoints += 50;
            } else if (numberThisTurn >= 40 && numberThisTurn <= 50) {
                counterInterval5++;
                sumScoredPoints += 100;
            } else if (numberThisTurn < 0 || numberThisTurn > 50) {
                counterIntervalInvalids++;
                sumScoredPoints /= 2;
            }
        }

        System.out.printf("%.2f\n", sumScoredPoints);
        System.out.printf("From 0 to 9: %.2f%%\n", counterInterval1 / numTurnsToPlay * 100.0);
        System.out.printf("From 10 to 19: %.2f%%\n", counterInterval2 / numTurnsToPlay * 100.0);
        System.out.printf("From 20 to 29: %.2f%%\n", counterInterval3 / numTurnsToPlay * 100.0);
        System.out.printf("From 30 to 39: %.2f%%\n", counterInterval4 / numTurnsToPlay * 100.0);
        System.out.printf("From 40 to 50: %.2f%%\n", counterInterval5 / numTurnsToPlay * 100.0);
        System.out.printf("Invalid numbers: %.2f%%\n", counterIntervalInvalids / numTurnsToPlay * 100.0);
    }
}
