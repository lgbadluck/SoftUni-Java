package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            String[] arrStr = scanner.nextLine().split(" ");
            if (i%2==0) {
                arrA[i] = Integer.parseInt(arrStr[0]);
                arrB[i] = Integer.parseInt(arrStr[1]);
            } else {
                arrA[i] = Integer.parseInt(arrStr[1]);
                arrB[i] = Integer.parseInt(arrStr[0]);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arrB[i] + " ");
        }
    }
}
