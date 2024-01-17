import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int pos1 = 1; pos1 <= n; pos1++) {
            for (int pos2 = 1; pos2 <= n; pos2++) {
                for (char pos3 = 'a'; pos3 < ((int)'a' + l); pos3++) {
                    for (char pos4 = 'a'; pos4 < ((int)'a' + l); pos4++) {
                        for (int pos5 = 1; pos5 <= n; pos5++) {
                            if (!(pos5 > pos1 && pos5>pos2)) continue;
                            else System.out.printf("%d%d%c%c%d ", pos1, pos2, pos3, pos4, pos5);
                        }
                    }
                }
            }
        }
    }
}
