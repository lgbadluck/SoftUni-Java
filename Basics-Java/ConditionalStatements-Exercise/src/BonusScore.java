import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (points <= 100) {
            bonus = 5.0;
        } else if (points > 1000) {
            bonus = points * 0.1;
        } else {
            bonus = points * 0.2;
        }

        if (points % 2 == 0){
            bonus += 1;
        } else if (points % 10 == 5) {
            bonus += 2;
        }

        System.out.printf("%.1f\n%.1f\n", bonus, (points + bonus));
    }
}
