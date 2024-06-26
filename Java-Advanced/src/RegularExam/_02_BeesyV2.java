package RegularExam;

import java.util.Scanner;

public class _02_BeesyV2 {

    private static int n;

    private static char[][] matrixBee;
    private static int beeRow, beeCol;
    private static int remainingEnergy = 15;
    private static int collectedNectar = 0;
    private static boolean wasRestore = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        matrixBee = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrixBee[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                if (matrixBee[i][j] == 'B') {
                    beeRow = i;
                    beeCol = j;
                }
            }
        }

        boolean isAtHive = false;
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.isEmpty()) break;
            isAtHive = repositionBee(command);
            if (isAtHive || remainingEnergy <= 0) break;
        }
        if (isAtHive && collectedNectar >= 30) {
            System.out.println("Great job, Beesy! The hive is full. Energy left: " + remainingEnergy);
        } else if (isAtHive) {
            System.out.println("Beesy did not manage to collect enough nectar.");
        } else if (remainingEnergy <= 0) {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        printMatrix(matrixBee);
    }

    private static boolean repositionBee(String command) {
        int newRow = beeRow;
        int newCol = beeCol;

        switch (command) {
            case "up":
                newRow = (beeRow - 1 + n) % n;
                break;
            case "down":
                newRow = (beeRow + 1) % n;
                break;
            case "left":
                newCol = (beeCol - 1 + n) % n;
                break;
            case "right":
                newCol = (beeCol + 1) % n;
                break;
        }

        matrixBee[beeRow][beeCol] = '-';

        char newPosition = matrixBee[newRow][newCol];
        remainingEnergy--;

        beeRow = newRow;
        beeCol = newCol;

        if (Character.isDigit(newPosition)) {
            collectedNectar += Character.getNumericValue(newPosition);
        }

        if (remainingEnergy <= 0 && collectedNectar >= 30 && !wasRestore) {
            int excessNectar = collectedNectar - 30;
            remainingEnergy += excessNectar;
            collectedNectar = 30;
            wasRestore = true;
        }
        matrixBee[beeRow][beeCol] = 'B';

        return newPosition == 'H';
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