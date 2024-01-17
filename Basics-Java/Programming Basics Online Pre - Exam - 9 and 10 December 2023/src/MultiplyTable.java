import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход
        //Входът е цяло трицифрено число в интервала [111…999].
        String textOf3Digits = scanner.nextLine();
        int digit3 = textOf3Digits.charAt(0) - '0';
        int digit2 = textOf3Digits.charAt(1) - '0';
        int digit1 = textOf3Digits.charAt(2) - '0';

        for (int pos1 = 1; pos1 <= digit1; pos1++) {
            for (int pos2 = 1; pos2 <= digit2; pos2++) {
                for (int pos3 = 1; pos3 <= digit3; pos3++) {
                    System.out.printf("%d * %d * %d = %d;\n", pos1,pos2,pos3, pos1*pos2*pos3);
                }
            }
        }


        //Изход
        //Да се отпечатат на конзолата няколко на брой реда в следния формат:
        //"{първата цифра} * {втората цифра} * {третата цифра} = {резултатът от умножението на
        //трите цифри};"
        //Първата, втората и третата цифра не могат да бъдат отрицателни числа или равни на 0
    }
}
