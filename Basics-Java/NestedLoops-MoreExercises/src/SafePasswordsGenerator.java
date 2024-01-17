import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCombinations = Integer.parseInt(scanner.nextLine());
        int numCombos = 0;
        char posA = 35;
        char posB = 64;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (posA>55) posA=35;
                if (posB>96) posB=64;
                System.out.printf("%c%c%d%d%c%c|", posA, posB, i, j, posB, posA);
                posA++;
                posB++;
                numCombos++;
                if (numCombos==maxCombinations) return;
            }
        }

    }
}
