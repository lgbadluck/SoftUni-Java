package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sumFreeSpace = 0;
        for (int i = 0; i < wagonsList.size(); i++) {
            int toFill = 4 - wagonsList.get(i);

            if (peopleInQueue >= toFill) {
                wagonsList.set(i, toFill + wagonsList.get(i));
                peopleInQueue -= toFill;
            } else {
                wagonsList.set(i, peopleInQueue + wagonsList.get(i));
                peopleInQueue -= peopleInQueue;
            }
            //System.out.println("sumFreeSpace: " + sumFreeSpace);
            //System.out.println("peopleInQueue: " + peopleInQueue);
            //System.out.println(wagonsList.toString().replace("[", "").replace("]", "").replace(",", " "));
        }

        for (int i = 0; i < wagonsList.size(); i++) {
            sumFreeSpace += 4 - wagonsList.get(i);
        }


        if (sumFreeSpace == 0 && peopleInQueue == 0) {
            System.out.println(wagonsList.toString().replace("[", "").replace("]", "").replace(", ", " "));
        } else if (sumFreeSpace == 0 && peopleInQueue > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleInQueue);
            System.out.println(wagonsList.toString().replace("[", "").replace("]", "").replace(", ", " "));
        } else if (sumFreeSpace > 0 && peopleInQueue == 0) {
            System.out.println("The lift has empty spots!");
            System.out.println(wagonsList.toString().replace("[", "").replace("]", "").replace(", ", " "));
        }
    }
}
