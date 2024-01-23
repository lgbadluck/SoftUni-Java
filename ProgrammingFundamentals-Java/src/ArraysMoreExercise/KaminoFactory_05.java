package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startIdx = Integer.MAX_VALUE;
        int prevStartIdx = Integer.MAX_VALUE;
        int bestStartIdx = Integer.MAX_VALUE;
        int sampleBestRow = -1;
        int countBest = -1;
        int countCurrBest = -1;
        int countPrevBest = -1;
        int sumBest = -1;

        int[] bestSample = new int[n];
        String input = scanner.nextLine();

        int row = 0;
        while (!input.equals("Clone them!")) {
            row++;
            int[] sample = Arrays.stream(input.split("[!]+")).mapToInt(Integer::parseInt).toArray();
/*
            System.out.print("\n");
            for (int i = 0; i < n; i++) {
                System.out.print(bestSample[i] + " ");
            }
            System.out.print("\n");
*/


            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=sample[i];
            }
            boolean isChanged = false;
            int counter = 0;
            for (int i = 0; i < n-1; i++) {
                boolean doCompare = false;
                startIdx = i;
                if (sample[i] == 1 && sample[i + 1]==1 ) {
                    //if (counter==0) startIdx = i;
                    counter++;
                    if (i==sample.length-2) {
                        countCurrBest = counter;
                        doCompare =true;
                    }
                } else {
                    if (counter > 0) {
                        countCurrBest = counter;
                        doCompare =true;
                    }
                    counter = 0;
                } if (doCompare) {
                    if(countCurrBest>=countPrevBest && countCurrBest>0) {
                        isChanged = true;
                        if(countCurrBest>countBest) {
                            bestStartIdx = startIdx;
                            countBest = countCurrBest;
                            sampleBestRow = row;
                            bestSample = sample;
                            sumBest = sum;
                        } else if(countCurrBest==countBest && startIdx<bestStartIdx) {
                            bestStartIdx = startIdx;
                            countBest = countCurrBest;
                            sampleBestRow = row;
                            bestSample = sample;
                            sumBest = sum;
                        } else if(countCurrBest==countBest && bestStartIdx==startIdx) {
                            if(sum > sumBest) {
                                countBest = countCurrBest;
                                sumBest = sum;
                                sampleBestRow = row;
                                bestSample = sample;
                            }
                        }
                    }
                    countPrevBest = countCurrBest;
                }
            }
            if(!isChanged) {
                if(sum > sumBest) {
                    sumBest = sum;
                    sampleBestRow = row;
                    bestSample = sample;
                }
            }
            
            input = scanner.nextLine();            
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", sampleBestRow, sumBest);
        for (int i = 0; i < n; i++) {
            System.out.print(bestSample[i] + " ");
        }

    }
}
