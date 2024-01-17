package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0) == '(' ||  input.charAt(0) == ')' ) {
                if (input.charAt(0) == '(' && isBalanced) {
                    isBalanced = false;
                } else if (input.charAt(0) == ')' && isBalanced) {
                    isBalanced = false;
                    break;
                } else if (input.charAt(0) == ')' && !isBalanced) {
                    isBalanced = true;
                } else if (input.charAt(0) == '(' && !isBalanced) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) System.out.println("BALANCED");
        else System.out.println("UNBALANCED");
    }
}
