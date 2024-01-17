import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCouple = Integer.parseInt(scanner.nextLine());
        int secondCouple = Integer.parseInt(scanner.nextLine());
        int firstDifferanceTillTopEnd = Integer.parseInt(scanner.nextLine());
        int secondDifferanceTillTopEnd = Integer.parseInt(scanner.nextLine());

        for (int i=firstCouple; i<=firstCouple+firstDifferanceTillTopEnd; i++) {
            if (i%2==0 || i%3==0 || i%5==0 || i%7==0 ) continue;
            for (int j=secondCouple; j<=secondCouple+secondDifferanceTillTopEnd; j++){
                if (j%2==0 || j%3==0 || j%5==0 || j%7==0 ) continue;
                System.out.printf("%d%d\n", i,j);
            }
        }

    }
}
