import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTimes = Integer.parseInt(scanner.nextLine());
        int totalWeightInTonsType1 = 0;
        int totalWeightInTonsType2 = 0;
        int totalWeightInTonsType3 = 0;
        double totalWeightAll = 0.0;
        int timesType1 = 0;
        int timesType2 = 0;
        int timesType3 = 0;
        double totalPrice = 0.0;
        double pricePerTonType1 = 200.0;
        double pricePerTonType2 = 175.0;
        double pricePerTonType3 = 120.0;
        double percentAvgType1 = 0.0;
        double percentAvgType2 = 0.0;
        double percentAvgType3 = 0.0;

        for (int i = 1; i <= numTimes; i++) {
            int weightThisTurn = Integer.parseInt(scanner.nextLine());
            if (weightThisTurn <= 3) {
                totalWeightInTonsType1 += weightThisTurn;
                totalPrice += weightThisTurn * pricePerTonType1;
                timesType1++;
            } else if (weightThisTurn <= 11) {
                totalWeightInTonsType2 += weightThisTurn;
                totalPrice += weightThisTurn * pricePerTonType2;
                timesType2++;
            } else if (weightThisTurn > 11) {
                totalWeightInTonsType3 += weightThisTurn;
                totalPrice += weightThisTurn * pricePerTonType3;
                timesType3++;
            }
        }
        totalWeightAll = totalWeightInTonsType1 + totalWeightInTonsType2 + totalWeightInTonsType3;
        percentAvgType1 = (totalWeightInTonsType1 / totalWeightAll) * 100.0;
        percentAvgType2 = (totalWeightInTonsType2 / totalWeightAll) * 100.0;
        percentAvgType3 = (totalWeightInTonsType3 / totalWeightAll) * 100.0;

        System.out.printf("%.2f\n", totalPrice / totalWeightAll);
        System.out.printf("%.2f%%\n", percentAvgType1);
        System.out.printf("%.2f%%\n", percentAvgType2);
        System.out.printf("%.2f%%\n", percentAvgType3);

    }
}
