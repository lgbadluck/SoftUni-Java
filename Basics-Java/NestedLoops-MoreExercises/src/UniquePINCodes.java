import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPos1 = Integer.parseInt(scanner.nextLine());
        int numPos2 = Integer.parseInt(scanner.nextLine());
        int numPos3 = Integer.parseInt(scanner.nextLine());

        for (int pos1 = 1; pos1 <= numPos1; pos1++) {
            if (pos1 % 2 == 1) continue;
            for (int pos2 = 2; pos2 <= numPos2; pos2++) {
                if (pos2!=2 && pos2!=3 && pos2!=5 && pos2!=7) continue;
                for (int pos3 =1; pos3<=numPos3; pos3++){
                    if (pos3 % 2 == 1) continue;
                    System.out.printf("%d %d %d \n", pos1, pos2, pos3);
                }
            }
        }
    }
}
