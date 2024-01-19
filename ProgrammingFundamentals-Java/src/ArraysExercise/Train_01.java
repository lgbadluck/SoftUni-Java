package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n  = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];

        for (int i = 0; i < n; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(train[i] + " ");
            sum += train[i];
        }

        System.out.println("\n" + sum);
    }
}
