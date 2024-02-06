package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger sumBigIntFactorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            if(i==0 || i ==1) continue;
            else sumBigIntFactorial = sumBigIntFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sumBigIntFactorial);
    }
}
