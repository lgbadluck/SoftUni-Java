import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startLimit = Integer.parseInt(scanner.next());
        int endLimit = Integer.parseInt(scanner.next());

        for (int pos1 = startLimit; pos1 <= endLimit; pos1++) {
            for (int pos2 = startLimit; pos2 <= endLimit; pos2++) {
                for (int pos3 = startLimit; pos3 <= endLimit; pos3++) {
                    if (  !( (pos2 + pos3) % 2 == 0 )  ) continue;
                    for (int pos4 = startLimit; pos4 <= endLimit; pos4++) {
                        if (!(pos1 > pos4)) continue;
                        if (pos1 % 2 == 0 && pos4 % 2 == 0) continue;
                        if (pos1 % 2 == 1 && pos4 % 2 == 1) continue;
                        System.out.printf("%d%d%d%d ", pos1, pos2, pos3, pos4);
                    }
                }
            }

        }
    }
}
