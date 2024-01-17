package BasicSyntaxConditinalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNum;

        while (n!=0) {
            inputNum = Integer.parseInt(scanner.nextLine());
            switch (inputNum) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    break;
                case 2:
                    System.out.print("a");
                    break;
                case 22:
                    System.out.print("b");
                    break;
                case 222:
                    System.out.print("c");
                    break;
                case 3:
                    System.out.print("d");
                    break;
                case 33:
                    System.out.print("e");
                    break;
                case 333:
                    System.out.print("f");
                    break;
                case 4:
                    System.out.print("g");
                    break;
                case 44:
                    System.out.print("h");
                    break;
                case 444:
                    System.out.print("i");
                    break;
                case 5:
                    System.out.print("j");
                    break;
                case 55:
                    System.out.print("k");
                    break;
                case 555:
                    System.out.print("l");
                    break;
                case 6:
                    System.out.print("m");
                    break;
                case 66:
                    System.out.print("n");
                    break;
                case 666:
                    System.out.print("o");
                    break;
                case 7:
                    System.out.print("p");
                    break;
                case 77:
                    System.out.print("q");
                    break;
                case 777:
                    System.out.print("r");
                    break;
                case 7777:
                    System.out.print("s");
                    break;
                case 8:
                    System.out.print("t");
                    break;
                case 88:
                    System.out.print("u");
                    break;
                case 888:
                    System.out.print("v");
                    break;
                case 9:
                    System.out.print("w");
                    break;
                case 99:
                    System.out.print("x");
                    break;
                case 999:
                    System.out.print("y");
                    break;
                case 9999:
                    System.out.print("z");
                    break;
                default:
                    break;
            }
            n--;
        }
    }
}
