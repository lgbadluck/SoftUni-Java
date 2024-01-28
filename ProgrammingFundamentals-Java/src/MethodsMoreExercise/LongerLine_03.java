package MethodsMoreExercise;

import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        printLongestLineOutOf2(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static void printLongestLineOutOf2(int point1x, int point1y, int point2x, int point2y, int point3x, int point3y, int point4x, int point4y) {
        int closestP1X, closestP1Y, closestP2X, closestP2Y = 0;
        double lineLenFirst, lineLenSecond;

        lineLenFirst = getDist((point1x - point2x), (point1y - point2y));
        lineLenSecond = getDist((point3x - point4x), (point3y - point4y));
        if (lineLenFirst >= lineLenSecond) {
            if (getDist(point1x, point1y) < getDist(point2x, point2y)) {
                closestP1X = point1x;
                closestP1Y = point1y;
                closestP2X = point2x;
                closestP2Y = point2y;
            } else {
                closestP1X = point2x;
                closestP1Y = point2y;
                closestP2X = point1x;
                closestP2Y = point1y;
            }
        } else {
            if (getDist(point3x, point3y) < getDist(point4x, point4y)) {
                closestP1X = point3x;
                closestP1Y = point3y;
                closestP2X = point4x;
                closestP2Y = point4y;
            } else {
                closestP1X = point4x;
                closestP1Y = point4y;
                closestP2X = point3x;
                closestP2Y = point3y;
            }
        }
        System.out.printf("(%d, %d)(%d, %d)\n", closestP1X, closestP1Y, closestP2X, closestP2Y);
    }

    public static double getDist(int coordinateX, int coordinateY) {
        double result = 0;

        result = Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
        return result;
    }
}

