package ArraysMoreExercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] pascalTriangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0) {
                    pascalTriangle[i][j]=1;
                } else pascalTriangle[i][j]=pascalTriangle[i-1][j]+pascalTriangle[i][j-1];
            }
        }

        for (int i = 0; i < n; i++) {
            int tempIdx = i;
            //(n+1)-pascalTriangle.length+i
            for (int j = 0; j < (n+1)-pascalTriangle.length+i; j++) {
                System.out.print(pascalTriangle[tempIdx--][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
