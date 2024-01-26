package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();
        System.out.println(getVowelsCount(inputStr));
    }
    public static int getVowelsCount(String input)
    {
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            char currChar = input.toLowerCase().charAt(i);
            if (currChar == 'e' || currChar == 'i' ||
                    currChar == 'o' || currChar == 'u' ||
                    currChar == 'a' ) {
                sum++;
            }
        }
        return sum;
    }
}
