package MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTribonacci(num);
    }

    public static void printTribonacci(int numberInSequence) {
        int tribPrev1 = 0;
        int tribPrev2 = 0;
        int tribPrev3 = 0;
        int currentTrib = 0;

        while (numberInSequence>0) {
            if(tribPrev1 == 0) {
                tribPrev1 = 1;
                System.out.print(tribPrev1 + " ");
                numberInSequence--;
                continue;
            }
            if(tribPrev2 == 0) {
                tribPrev2 = 1;
                System.out.print(tribPrev2 + " ");
                numberInSequence--;
                continue;
            }
            if(tribPrev3 == 0) {
                tribPrev3 = 2;
                System.out.print(tribPrev3 + " ");
                numberInSequence--;
                continue;
            }
            currentTrib = tribPrev1+tribPrev2+tribPrev3;
            System.out.print(currentTrib + " ");
            tribPrev1= tribPrev2;
            tribPrev2= tribPrev3;
            tribPrev3= currentTrib;
            numberInSequence--;
        }
    }
}
