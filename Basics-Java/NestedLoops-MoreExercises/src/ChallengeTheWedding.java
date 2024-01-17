import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMen = Integer.parseInt(scanner.nextLine());
        int numWomen = Integer.parseInt(scanner.nextLine());
        int numFreeTable = Integer.parseInt(scanner.nextLine());
        int numTablesTaken = 0;

        for (int men=1; men<=numMen; men++){
            for (int women=1; women<=numWomen; women++) {
                System.out.printf("(%d <-> %d) ", men,women);
                numTablesTaken++;
                if(numTablesTaken==numFreeTable) return;
            }
        }
    }
}
