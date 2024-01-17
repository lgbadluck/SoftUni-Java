import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins1BGN = Integer.parseInt(scanner.nextLine());
        int coins2BGN = Integer.parseInt(scanner.nextLine());
        int banknotes5BGN = Integer.parseInt(scanner.nextLine());
        int sumToHave = Integer.parseInt(scanner.nextLine());

        for (int numCoins1BGN=0; numCoins1BGN<=coins1BGN; numCoins1BGN++) {
            for (int numCoins2BGN=0; numCoins2BGN<=coins2BGN; numCoins2BGN++) {
                for (int numBanknotes5BGN=0; numBanknotes5BGN<=banknotes5BGN; numBanknotes5BGN++) {
                    if (sumToHave==(numCoins1BGN*1 + numCoins2BGN*2 + numBanknotes5BGN*5) ) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", numCoins1BGN, numCoins2BGN, numBanknotes5BGN, sumToHave);
                    }
                }
            }
        }

    }
}
