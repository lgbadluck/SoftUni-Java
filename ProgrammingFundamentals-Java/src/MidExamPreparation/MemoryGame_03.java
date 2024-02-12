package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = 0;

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            int firstIdx = Integer.parseInt(input.split(" ")[0]);
            int secondIdx = Integer.parseInt(input.split(" ")[1]);
            moves++;

            if (firstIdx == secondIdx || firstIdx<0 || secondIdx>elements.size()-1 || secondIdx<0 || firstIdx>elements.size()-1 ) {
                String newElement = "-" + moves + "a";
                elements.add(elements.size()/2, newElement);
                elements.add(elements.size()/2, newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            }else if (elements.get(firstIdx).equals(elements.get(secondIdx))) {
                System.out.printf("Congrats! You have found matching elements - %s!\n", elements.get(firstIdx));
                if(firstIdx>secondIdx) {
                    elements.remove(firstIdx);
                    elements.remove(secondIdx);
                } else {
                    elements.remove(secondIdx);
                    elements.remove(firstIdx);
                }
            } else {
                System.out.println("Try again!");
            }

            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!\n", moves);
                break;
            }

            input = scanner.nextLine();
        }

        if(!elements.isEmpty()) {
            System.out.printf("Sorry you lose :(\n");
            System.out.println(elements.toString()
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        }
    }
}
