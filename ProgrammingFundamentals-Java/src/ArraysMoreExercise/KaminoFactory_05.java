package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sampleBestIdx = -1;
        int countBest = 0;
        int countCurrBest = 0;
        int countPrevBest = 0;
        int sumBest = 0;

        String bestSample = "";

        //int[] dnaSample = Arrays.stream(scanner.nextLine().split("!")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            int idx = 1;
            int[] sample = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sample[i] == 1) {
                    count++;
                    sum += sample[i];
                } else {
                    if (count > countCurrBest) countCurrBest = count;
                    count = 0;
                }
            }
            if (countCurrBest > countPrevBest && sum > sumBest) {
                countBest = count;
                sumBest = sum;
                sampleBestIdx = idx;
                for (int i = 0; i < n; i++) {
                    bestSample = sample[i] + " ";
                }
            }
            idx++;
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n%s\n", sampleBestIdx, sumBest, bestSample);

    }
}
