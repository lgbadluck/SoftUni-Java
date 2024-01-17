package DataTypesandVariableExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        if (n%p==0) System.out.println(n/p);
        else System.out.println(n/p+1);
    }
}
