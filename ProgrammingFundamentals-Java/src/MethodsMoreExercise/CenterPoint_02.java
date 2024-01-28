package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printCenterPointOf2Coords(x1, y1, x2, y2);
    }

    public static void printCenterPointOf2Coords(int point1x, int point1y, int point2x, int point2y) {
        int closestX, closestY;
        if (getDistToCenter(point1x,point1y)<getDistToCenter(point2x,point2y)){
            closestX=point1x;
            closestY=point1y;
        } else {
            closestX=point2x;
            closestY=point2y;
        }
        System.out.printf("(%d, %d)\n", closestX, closestY);
    }
    public static double getDistToCenter(int coordinateX, int coordinateY){
        double result = 0;

        result = Math.sqrt(Math.pow(coordinateX,2) +  Math.pow(coordinateY,2));
        return result;
    }
}
