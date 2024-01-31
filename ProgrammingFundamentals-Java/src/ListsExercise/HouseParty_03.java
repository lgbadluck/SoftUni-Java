package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> listOfGuests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if(input.length>=3) {
                String name = input[0];
                if (input[2].equals("not")) {
                    if (!listOfGuests.contains(name)) {
                        System.out.println(name + " is not in the list!");
                    } else {
                        listOfGuests.remove(name);
                    }
                } else if (input[2].equals("going!")) {
                    if (!listOfGuests.contains(name)) {
                        listOfGuests.add(name);
                    } else {
                        System.out.println(name + " is already in the list!");
                    }
                }
            }
        }

        for (int i = 0; i < listOfGuests.size(); i++) {
            System.out.println(listOfGuests.get(i));
        }
    }
}
