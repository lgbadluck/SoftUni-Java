package _02_EncapsulationExercise._05_FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Team> teamsMap = new LinkedHashMap();

        while (!input.equals("END")) {
            String[] commands = input.split(";");
            String methodToCall = commands[0];
            String teamName = commands[1];
            String playerName = "";

            switch (methodToCall) {
                case "Team":
                    teamsMap.put(teamName, new Team(teamName));
                    break;
                case "Add":
                    playerName = commands[2];
                    int playerEndurance = Integer.parseInt(commands[3]);
                    int playerSprint = Integer.parseInt(commands[4]);
                    int playerDribble = Integer.parseInt(commands[5]);
                    int playerPassing = Integer.parseInt(commands[6]);
                    int playerShooting = Integer.parseInt(commands[7]);
                    if (!teamsMap.containsKey(teamName)) {
                        //throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                        System.out.println("Team " + teamName + " does not exist.");
                    } else {
                        try {
                        teamsMap.get(teamName)
                                .addPlayer(new Player(
                                        playerName,
                                        playerEndurance,
                                        playerSprint,
                                        playerDribble,
                                        playerPassing,
                                        playerShooting)
                                );
                        } catch (Exception exception) {
                            break;
                        }
                    }
                    break;
                case "Remove":
                    playerName = commands[2];
                    if (!teamsMap.containsKey(teamName)) {
                        //throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                        System.out.println("Team " + teamName + " does not exist.");
                    } else {
                        teamsMap.get(teamName)
                                .removePlayer(playerName);
                    }
                    break;
                case "Rating":
                    if (!teamsMap.containsKey(teamName)) {
                        //throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                        System.out.println("Team " + teamName + " does not exist.");
                    } else {
                        double teamRating = teamsMap.get(teamName).getRating();
                        System.out.printf("%s - %.0f\n", teamName, teamRating);
                    }
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;

            }

            input = scanner.nextLine();
        }
    }
}
