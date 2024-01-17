import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magicNumber = Integer.parseInt(scanner.next());

        for (int pos1 = 1; pos1 <= 9; pos1++) {
            for (int pos2 = 1; pos2 <= 9; pos2++) {
                if (!(magicNumber % (pos1 + pos2) == 0)) continue;
                for (int pos3 = 1; pos3 <= 9; pos3++) {
                    for (int pos4 = 1; pos4 <= 9; pos4++) {
                        if ( (pos1 + pos2) != (pos3 + pos4) ) continue;
                        System.out.printf("%d%d%d%d ", pos1, pos2, pos3, pos4);
                    }
                }
            }
        }

    }
}
