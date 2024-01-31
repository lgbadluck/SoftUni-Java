package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        //System.out.println(train.toString().replaceAll("[\\[\\],]", ""));

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")){
            String cmd1 = input[0];
            String cmd2 = "";
            if (input.length>1) cmd2 = input[1];

            if (cmd1.equals("Add")) {
                int wagonCapacity = Integer.parseInt(cmd2);
                addWagonToTrainEnd(train, wagonCapacity);
            } else {
                int passengersToPlace = Integer.parseInt(cmd1);
                findAndFillSpaceInWagon(train, passengersToPlace, maxCapacity);
            }

            input = scanner.nextLine().split(" ");;
        }

        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
    public static int addWagonToTrainEnd(List<Integer> listOfWagons, int capacity)
    {
        listOfWagons.add(capacity);
        return 1;
    }
    public static int findAndFillSpaceInWagon(List<Integer> listOfWagons, int numOfPassengers, int maxCapacity)
    {
        for (int i = 0; i < listOfWagons.size(); i++) {
            int freeSpaceWagon = maxCapacity - listOfWagons.get(i);
            if (freeSpaceWagon >= numOfPassengers) {
                listOfWagons.set(i, (listOfWagons.get(i) + numOfPassengers));
                return 1;
            }
        }
        return 0;
    }
}
