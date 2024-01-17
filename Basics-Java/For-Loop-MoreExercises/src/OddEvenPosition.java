import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i<=n; i++) {
            double number  = Double.parseDouble(scanner.nextLine());
            if(i%2==0) {
                if (number>evenMax) evenMax=number;
                if (number<evenMin) evenMin=number;
                evenSum+=number;
            }
            else {
                if (number>oddMax) oddMax=number;
                if (number<oddMin) oddMin=number;
                oddSum+=number;
            }
        }


        System.out.printf("OddSum=%.2f,\n", oddSum);
        if (oddSum==0) {
            System.out.printf("OddMin=No,\n");
            System.out.printf("OddMax=No,\n");
        } else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if (evenSum==0) {
            System.out.printf("EvenMin=No,\n");
            System.out.printf("EvenMax=No\n");
        } else {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
            System.out.printf("EvenMax=%.2f\n", evenMax);
        }
    }
}
