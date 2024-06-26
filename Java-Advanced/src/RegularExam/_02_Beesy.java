package RegularExam;

import java.util.Scanner;

public class _02_Beesy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        fillTheMatrix(matrix, scanner);

        int[] beePosition = findPositionOf(matrix, 'B'); // row,col
        int beeRow = beePosition[0];
        int beeCol = beePosition[1];

//        int[] hivePosition = findPositionOf(matrix, 'H'); // row,col
//        int hiveRow = hivePosition[0];
//        int hiveCol = hivePosition[1];

        boolean isNotRestored = true;
        int remainingBeeEnergy = 15;
        int nectarCollected = 0;

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.isEmpty()) break;
            remainingBeeEnergy--;

            int newRow = beeRow;
            int newCol = beeCol;

            switch (command) {
                case "up":
                    newRow--;
                    if (newRow < 0) newRow = n - 1;
                    break;
                case "down":
                    newRow++;
                    if (newRow == n) newRow = 0;
                    break;
                case "right":
                    newCol++;
                    if (newCol == n) newCol = 0;
                    break;
                case "left":
                    newCol--;
                    if (newCol < 0) newCol = n - 1;
                    break;
            }

            char symbol = matrix[newRow][newCol];
            if (Character.isDigit(symbol)) {
                nectarCollected += Integer.parseInt(String.valueOf(symbol));
                updateMatrix(matrix, newRow, newCol, beeRow, beeCol);
                beeRow = newRow;
                beeCol = newCol;
            } else if (symbol == 'H') {
                updateMatrix(matrix, newRow, newCol, beeRow, beeCol);
                beeRow = newRow;
                beeCol = newCol;

                //Beesy at Hive check if enough nectar collected and print output (END OF While)
                if (nectarCollected < 30) {
                    System.out.println("Beesy did not manage to collect enough nectar.");
                    printMatrix(matrix);
                    return;
                } else {
                    System.out.printf("Great job, Beesy! The hive is full. Energy left: %d\n", remainingBeeEnergy);
                    printMatrix(matrix);
                    return;
                }
            } else if (symbol == '-') {
                updateMatrix(matrix, newRow, newCol, beeRow, beeCol);
                beeRow = newRow;
                beeCol = newCol;
            }

            if (remainingBeeEnergy <= 0 && nectarCollected >= 30 && isNotRestored) {
                isNotRestored = false;
                remainingBeeEnergy += nectarCollected - 30;
                nectarCollected = 30;
            }
            if (remainingBeeEnergy <= 0) {
                System.out.println("This is the end! Beesy ran out of energy.");
                printMatrix(matrix);
                break;
            }
        }
    }

    private static void updateMatrix(char[][] matrix, int newRow, int newCol, int beeRow, int beeCol) {
        matrix[newRow][newCol] = 'B';
        matrix[beeRow][beeCol] = '-';
    }

    private static void fillTheMatrix(char[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }

    private static int[] findPositionOf(char[][] matrix, char target) {

        int[] myPosition = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    myPosition[0] = row;
                    myPosition[1] = col;
                }
            }
        }
        return myPosition;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
