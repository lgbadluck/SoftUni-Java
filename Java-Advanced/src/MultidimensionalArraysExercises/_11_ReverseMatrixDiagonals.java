package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int row = rows - 1;
        int col = cols - 1;


        while (row != -1){
            int r = row;
            int c = col;
            StringBuilder output = new StringBuilder();
            while (c < cols && r >= 0){
                output.append(matrix[r--][c++]);
                output.append(" ");
            }
            System.out.println(output);
            col--;
            if(col == -1){
                col = 0;
                row--;
            }
        }
    }
}
