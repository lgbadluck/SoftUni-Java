package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrStr = scanner.nextLine().split(" ");

        for (int i = 0; i < arrStr.length/2; i++) {
            String temp = arrStr[i];
            arrStr[i] = arrStr[arrStr.length-1-i];
            arrStr[arrStr.length-1-i] = temp;
        }

        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + " ");
        }
    }
}
