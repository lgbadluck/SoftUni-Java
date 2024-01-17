package DataTypesandVariablesLab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        char a = 'A'; //65
        char z = 'Z'; //90

        char b = 'a'; //97
        char x = 'z'; //122

        System.out.printf("A: %d, a: %d\n", (int)a, (int)b);
        System.out.printf("Z: %d, z: %d\n", (int)z, (int)x);
        */

        char char1 = scanner.nextLine().charAt(0);

        if ((int)char1 >= (int)'A' && (int)char1 <= (int)'Z') {
            System.out.println("upper-case");
        }
        if ((int)char1 >= (int)'a' && (int)char1 <= (int)'z') {
            System.out.println("lower-case");
        }
    }
}
