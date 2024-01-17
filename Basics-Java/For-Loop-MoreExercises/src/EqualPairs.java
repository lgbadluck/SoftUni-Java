import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPairs = Integer.parseInt(scanner.nextLine());
        int valueCurrentPair = 0;
        int valueLastPair = 0;
        int lastPairDifference = 0;
        int currentPairDifference = 0;
        int maxPairDifference = 0;

        for (int i = 0; i < numPairs; i++) {
            int numA = Integer.parseInt(scanner.nextLine());
            int numB = Integer.parseInt(scanner.nextLine());
            valueCurrentPair = numA+numB;
            if (i==0) {
                valueLastPair = valueCurrentPair;;
            }
            else {
                if (valueCurrentPair!=valueLastPair) {
                    currentPairDifference = Math.abs(valueCurrentPair-valueLastPair);
                    if (maxPairDifference < currentPairDifference )
                    {
                        maxPairDifference = currentPairDifference;
                    }
                    lastPairDifference = currentPairDifference;
                }
                valueLastPair = valueCurrentPair;
            }

        }

        if (lastPairDifference>0) {
            System.out.printf("No, maxdiff=%d\n", lastPairDifference);
        } else System.out.printf("Yes, value=%d\n", valueCurrentPair);
    }
}
