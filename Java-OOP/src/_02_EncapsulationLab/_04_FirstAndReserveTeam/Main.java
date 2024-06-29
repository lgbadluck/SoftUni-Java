package _02_EncapsulationLab._04_FirstAndReserveTeam;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Eagles");

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            try {
                team.addPlayer(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("First team have %d players\n" +
                        "Reserve team have %d players",
                team.getFirstTeam().size(),
                team.getReserveTeam().size());
    }
}
