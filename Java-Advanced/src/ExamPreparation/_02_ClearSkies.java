package ExamPreparation;

import java.util.Scanner;

public class _02_ClearSkies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] board = new char[size][size];

        int row = 0, col = 0;

        for (int r = 0; r < size; r++) {
            String line = scanner.nextLine();
            board[r] = line.toCharArray();
            if (line.contains("J")) {
                row = r;
                col = line.indexOf("J");
            }
        }


        int fighterJetArmor = 300;
        int numOfEnemies = 4;

        //String direction = scanner.nextLine();

        boolean isInFightingCondition = true;
        while (isInFightingCondition) {
            String direction = scanner.nextLine();
            if (direction.equals("up")) {
                switch (moveJet(row, col, row - 1, col, board)) {
                    case 1:
                        break;
                    case 2:
                        if (fighterJetArmor > 100) {
                            if (numOfEnemies > 1) {
                                fighterJetArmor -= 100;
                            }
                            numOfEnemies--;
                            if (numOfEnemies == 0) {
                                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                                isInFightingCondition = false;
                            }
                        } else {
                            System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + (row - 1) + ", " + col + "]!");
                            isInFightingCondition = false;
                        }
                        break;
                    case 3:
                        if (fighterJetArmor<300) {
                            fighterJetArmor+=300;
                        }
                        break;

                }
                row--;
            } else if (direction.equals("down")) {
                switch (moveJet(row, col, row + 1, col, board)) {
                    case 1:
                        break;
                    case 2:
                        if (fighterJetArmor > 100) {
                            if (numOfEnemies > 1) {
                                fighterJetArmor -= 100;
                            }
                            numOfEnemies--;
                            if (numOfEnemies == 0) {
                                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                                isInFightingCondition = false;
                            }
                        } else {
                            System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + (row + 1) + ", " + col + "]!");
                            isInFightingCondition = false;
                        }
                        break;
                    case 3:
                        if (fighterJetArmor<300) {
                            fighterJetArmor+=300;
                        }
                        break;

                }
                row++;
            } else if (direction.equals("left")) {
                switch (moveJet(row, col, row, col - 1, board)) {
                    case 1:
                        break;
                    case 2:
                        if (fighterJetArmor > 100) {
                            if (numOfEnemies > 1) {
                                fighterJetArmor -= 100;
                            }
                            numOfEnemies--;
                            if (numOfEnemies == 0) {
                                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                                isInFightingCondition = false;
                            }
                        } else {
                            System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + row + ", " + (col - 1) + "]!");
                            isInFightingCondition = false;

                        }
                        break;
                    case 3:
                        if (fighterJetArmor<300) {
                            fighterJetArmor+=300;
                        }
                        break;

                }
                col--;
            } else {
                switch (moveJet(row, col, row, col + 1, board)) {
                    case 1:
                        break;
                    case 2:
                        if (fighterJetArmor > 100) {
                            if (numOfEnemies > 1) {
                                fighterJetArmor -= 100;
                            }
                            numOfEnemies--;
                            if (numOfEnemies == 0) {
                                System.out.println("Mission accomplished, you neutralized the aerial threat!");
                                isInFightingCondition = false;
                            }
                        } else {
                            System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + row + ", " + (col + 1) + "]!");
                            isInFightingCondition = false;
                        }
                        break;
                    case 3:
                        if (fighterJetArmor<300) {
                        fighterJetArmor+=300;
                    }
                        break;

                }
                col++;
            }
        }
        printBoard(board);
    }

    private static int moveJet(int row, int col, int nextRow, int nextCol, char[][] board) {
        if (!isInBounds(nextRow, nextCol, board)) {
            return 0;
        }
        int result = 0;
        // 1 - Normal move to '-'
        // 2 - Normal move to 'E'
        // 3 - Normal move to 'R'

        char nextPosSymbol = board[nextRow][nextCol];

        if (nextPosSymbol == '-') {
            result = 1;
        } else if (nextPosSymbol == 'E') {
            result = 2;
        } else if (nextPosSymbol == 'R') {
            result = 3;
        }

        board[row][col] = '-';
        board[nextRow][nextCol] = 'J';

        return result;
    }

    public static boolean isInBounds(int r, int c, char[][] board) {
        return r >= 0 && r < board.length && c >= 0 && c < board[r].length;
    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
