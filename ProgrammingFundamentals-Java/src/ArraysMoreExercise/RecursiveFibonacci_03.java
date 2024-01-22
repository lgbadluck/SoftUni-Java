package ArraysMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static int GetFib(int x) {
        if (x==1) return 1;
        else if (x==2) return 1;
        else return GetFib(x-1) + GetFib(x-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(GetFib(n));
    }

}
