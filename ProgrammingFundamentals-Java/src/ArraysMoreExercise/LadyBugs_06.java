package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String fieldStr = scanner.nextLine();
        int[] fieldNumArr = new int[n];

        //System.out.print("BEFORE fieldNumArr: ");
        String[] fieldStrArr = fieldStr.split("\\s+");
        for (int i = 0; i < fieldStrArr.length; i++) {
            fieldNumArr[i] = Integer.parseInt(fieldStrArr[i]);
            if (fieldNumArr[i] > 0) fieldNumArr[i] = 1;
            //System.out.print(fieldNumArr[i] + " ");
        }


        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            /*
            System.out.println();
            for (int i = 0; i < commandArr.length; i++) {
                System.out.printf("%s ", commandArr[i]);
            }
            System.out.println();
            */
            int position = Integer.parseInt(commandArr[0]);
            String direction = commandArr[1];
            int distance = Integer.parseInt(commandArr[2]);

            if (fieldNumArr[position]==1) {
                fieldNumArr[position] = 0;
                switch (direction) {
                    case "right":
                        do{
                            position+=distance;
                            if(position<0 || position>n-1) {
                                break;
                            }
                        } while (fieldNumArr[position]!=0);
                        if(!(position<0 || position>n-1)) fieldNumArr[position]++;
                        break;
                    case "left":
                        do{
                            position-=distance;
                            if(position<0 || position>n-1) {
                                break;
                            }
                        } while (fieldNumArr[position]!=0);
                        if(!(position<0 || position>n-1)) fieldNumArr[position]++;
                        break;
                    default:
                        System.out.printf("Error - direction unknown!");
                        break;
                }
            }
            command = scanner.nextLine();
        }

        //System.out.print("fieldNumArr: ");
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(fieldNumArr[i] + " ");
        }

    }
}
