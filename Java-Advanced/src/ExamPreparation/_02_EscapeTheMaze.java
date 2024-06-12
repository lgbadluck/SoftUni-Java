package ExamPreparation;

import java.util.Scanner;

public class _02_EscapeTheMaze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        int[] playerInfo = new int[4];
        playerInfo[0] = -1;
        playerInfo[1] = -1;
        playerInfo[2] = 100;

        //GameState:
        // 0 - Player is Alive
        // 1 - Player is Dead (Health = 0)
        // 2 - Player found exit
        playerInfo[3] = 0;


        for (int row = 0; row < n; row++) {
            String[] data = scanner.nextLine().split("");
            for (int col = 0; col < n; col++) {
                if (data[col].equals("P")) {
                    playerInfo[0] = row;
                    playerInfo[1] = col;
                    matrix[row][col] = data[col];
                } else {
                    matrix[row][col] = data[col];
                }
            }
        }

        String input = scanner.nextLine();

        while (playerInfo[3] == 0) {
            switch (input) {
                case "up":
                    playerInfo = movePlayer(-1, 0, playerInfo, matrix);
                    break;
                case "down":
                    playerInfo = movePlayer(1, 0, playerInfo, matrix);
                    break;
                case "left":
                    playerInfo = movePlayer(0, -1, playerInfo, matrix);
                    break;
                case "right":
                    playerInfo = movePlayer(0, 1, playerInfo, matrix);
                    break;
                default:
                    System.out.println("unknown input!");
                    break;
            }

            if(playerInfo[3] == 1) {
                System.out.println("Player is dead. Maze over!");
                break;
            }
            if(playerInfo[3] == 2) {
                System.out.println("Player escaped the maze. Danger passed!");
                break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Player's health: " + playerInfo[2] + " units");
        printMatrixState(matrix);

    }
    public static void printMatrixState(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.print(System.lineSeparator());
        }
    }
    public static int[] movePlayer(int changeRow, int changeCol, int[] playerState, String[][] matrix) {
        int currentRow = playerState[0];
        int currentCol = playerState[1];
        int playerHealth = playerState[2];

        int newRow = currentRow + changeRow;
        int newCol = currentCol + changeCol;

        if ((newRow > matrix.length - 1 || newRow < 0)
                || (newCol > matrix.length - 1 || newCol < 0)) {
            return playerState;
        } else {
            if (matrix[newRow][newCol].equals("-")) {
                playerState[0] = newRow;
                playerState[1] = newCol;
                matrix[currentRow][currentCol] = "-";
                matrix[newRow][newCol] = "P";
                return playerState;
            } else if (matrix[newRow][newCol].equals("M")) {
                playerState[0] = newRow;
                playerState[1] = newCol;
                playerState[2] = Math.max(0, playerHealth - 40);
                matrix[currentRow][currentCol] = "-";
                matrix[newRow][newCol] = "P";
                if (playerState[2] == 0) playerState[3] = 1;
                return playerState;
            } else if (matrix[newRow][newCol].equals("H")) {
                playerState[0] = newRow;
                playerState[1] = newCol;
                playerState[2] = Math.min(100, playerHealth + 15);
                matrix[currentRow][currentCol] = "-";
                matrix[newRow][newCol] = "P";
                return playerState;
            } else if (matrix[newRow][newCol].equals("X")) {
                playerState[0] = newRow;
                playerState[1] = newCol;
                matrix[currentRow][currentCol] = "-";
                matrix[newRow][newCol] = "P";
                playerState[3] = 2;
                return playerState;
            }
        }
        return playerState;
    }
}