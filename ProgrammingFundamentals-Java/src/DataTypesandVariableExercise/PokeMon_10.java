package DataTypesandVariableExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int sumTargets = 0;
        int originalN = N;

        if (N<M) {
            System.out.printf("%d\n%d\n", N, sumTargets);
        }
        else{
            while (N>=M) {
                sumTargets++;
                N-=M;
                if (N==(originalN*0.50) && Y>0) {
                    N=N/Y;
                }
            }
            System.out.printf("%d\n%d\n", N, sumTargets);
        }
    }
}
