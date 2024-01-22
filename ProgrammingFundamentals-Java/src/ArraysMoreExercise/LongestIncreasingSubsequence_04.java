package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] len = new int[numbers.length];
        int[] prev = new int[numbers.length];

        int lastIdx = -1;
        int maxLen = 0;

        for (int i = 0; i < numbers.length; i++) {
            len[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if( (numbers[j] < numbers[i]) && (len[j]+1 > len[i]) ) {
                    len[i] = len[j]+1;
                    prev[i] = j;
                }
            }

            if (len[i] > maxLen) {
                maxLen = len[i];
                lastIdx = i;
            }

        }

        int[] lis = new int[maxLen];
        int currentIdx = maxLen - 1;

        while (lastIdx != -1) {
            lis[currentIdx] = numbers[lastIdx];
            currentIdx--;
            lastIdx = prev[lastIdx];
        }

        for (int i = 0; i < lis.length; i++) {
            System.out.print(lis[i] + " ");
        }
    }
}
