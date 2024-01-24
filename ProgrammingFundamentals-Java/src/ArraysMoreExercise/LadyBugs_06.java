package ArraysMoreExercise;

import java.util.Scanner;
import java.util.Arrays;

public class LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] fieldNumArr = new int[n];
        String[] fieldStrArr = scanner.nextLine().split(" ");
        for (int i = 0; i < fieldStrArr.length; i++) {
            int index = Integer.parseInt(fieldStrArr[i]);
            if (index >= 0 && index < fieldNumArr.length) fieldNumArr[index] = 1;
        }


        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] commandArr = command.split(" ");
            int position = Integer.parseInt(commandArr[0]);
            String direction = commandArr[1];
            int distance = Integer.parseInt(commandArr[2]);

            if( position<0 || position>fieldNumArr.length-1 || fieldNumArr[position]==0) {
                command = scanner.nextLine();
                continue;
            }

            fieldNumArr[position]=0;

            if (direction.equals("right")) {
                position+=distance;
                if (!(position<0 || position>fieldNumArr.length-1) && fieldNumArr[position]==1){
                    while (fieldNumArr[position]==1) {
                        position+=distance;
                        if( position<0 || position>fieldNumArr.length-1 ) break;
                    }
                }
                if ( !(position<0 || position>fieldNumArr.length-1) ) {
                    fieldNumArr[position]=1;
                }
            } else if (direction.equals("left")) {
                position-=distance;
                if (!(position<0 || position>fieldNumArr.length-1) && fieldNumArr[position]==1){
                    while (fieldNumArr[position]==1) {
                        position-=distance;
                        if( position<0 || position>fieldNumArr.length-1 ) break;
                    }
                }
                if ( !(position<0 || position>fieldNumArr.length-1) ) {
                    fieldNumArr[position]=1;
                }
            }

            command = scanner.nextLine();
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(fieldNumArr[i] + " ");
        }

    }
}
