package MethodsLab;

import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        String result = repeatStr(inputStr, repeatTimes);
        System.out.println(result);
    }

    public static String repeatStr(String inputStr, int times) {
        String funcResult = "";

        for (int i = 1; i <= times; i++) {
            funcResult = funcResult + inputStr;
        }

        return funcResult;
    }
}
