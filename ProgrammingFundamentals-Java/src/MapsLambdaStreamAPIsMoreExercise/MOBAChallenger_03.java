package MapsLambdaStreamAPIsMoreExercise;

import java.util.*;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, Integer>> playersPositionSkillMap = new LinkedHashMap<>();
        TreeMap<String, Integer> playersSkillMap = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Season end")) {
            if (input.contains(" -> ")) {
                String player = input.split("->")[0].trim();
                String position = input.split("->")[1].trim();
                int skill = Integer.parseInt(input.split("->")[2].trim());

                playersPositionSkillMap.putIfAbsent(player, new TreeMap<>());
                playersPositionSkillMap.get(player).putIfAbsent(position, 0);
                if (skill > playersPositionSkillMap.get(player).get(position))
                    playersPositionSkillMap.get(player).put(position, skill);

            } else if (input.contains(" vs ")) {
                String player1 = input.split(" vs ")[0].trim();
                String player2 = input.split(" vs ")[1].trim();
                //System.out.printf("%s vs %s\n", player1, player2);

                if (playersPositionSkillMap.containsKey(player1) && playersPositionSkillMap.containsKey(player2)) {
                    // Both players exist - Time to Duel
                    boolean hasMatchingPositions = false;
                    for (Map.Entry<String, Integer> entryPlayer1 : playersPositionSkillMap.get(player1).entrySet()) {
                        String positionToMatch = entryPlayer1.getKey();
                        for (Map.Entry<String, Integer> entryPlayer2 : playersPositionSkillMap.get(player2).entrySet()) {
                            if (entryPlayer2.getKey().equals(positionToMatch)) {
                                hasMatchingPositions = true;
                                break;
                            }
                        }
                        if (hasMatchingPositions) break;
                    }
                    if (hasMatchingPositions) {
                        int sumPlayer1 = 0;
                        for (Map.Entry<String, Integer> entryPlayer1 : playersPositionSkillMap.get(player1).entrySet()) {
                            sumPlayer1 += entryPlayer1.getValue();
                        }
                        //System.out.println("Player1: " + player1 + " Total sKill: " + sumPlayer1);

                        int sumPlayer2 = 0;
                        for (Map.Entry<String, Integer> entryPlayer2 : playersPositionSkillMap.get(player2).entrySet()) {
                            sumPlayer2 += entryPlayer2.getValue();

                            if (sumPlayer1 > sumPlayer2) {
                                playersPositionSkillMap.remove(player2);
                            } else if (sumPlayer2 > sumPlayer1) {
                                playersPositionSkillMap.remove(player1);
                            }
                        }
                        //System.out.println("Player2: " + player2 + " Total sKill: " + sumPlayer2);
                    }
                }
            }
            input = scanner.nextLine();
        }
        //Add the Map Player Sum(ofSkills);
        for (Map.Entry<String, TreeMap<String, Integer>> entry : playersPositionSkillMap.entrySet()) {
            playersSkillMap.putIfAbsent(entry.getKey(), 0);
            for (Map.Entry<String, Integer> innerEntry : entry.getValue().entrySet()) {
                playersSkillMap.put(entry.getKey(), playersSkillMap.get(entry.getKey()) + innerEntry.getValue());
            }
        }

        // Convert the map's entrySet into a List of entries
        List<Map.Entry<String, Integer>> entryListPlayerSkill = new ArrayList<>(playersSkillMap.entrySet());
        // Sort the List using Collections.sort() method with a custom Comparator that compares the values of the entries in reverse order
        entryListPlayerSkill.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<String, Integer> e : entryListPlayerSkill) {
            System.out.printf("%s: %d skill\n", e.getKey(), e.getValue());
            for (Map.Entry<String, TreeMap<String, Integer>> entry : playersPositionSkillMap.entrySet()) {
                // Convert the map's entrySet into a List of entries
                List<Map.Entry<String, Integer>> entryListPlayerPositionSkill = new ArrayList<>(entry.getValue().entrySet());
                // Sort the List using Collections.sort() method with a custom Comparator that compares the values of the entries in reverse order
                entryListPlayerPositionSkill.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
                for (Map.Entry<String, Integer> ePosSkill : entryListPlayerPositionSkill) {
                    if (e.getKey().equals(entry.getKey())) {
                        System.out.printf("- %s <::> %d\n", ePosSkill.getKey(), ePosSkill.getValue());
                    }
                }
            }
        }
    }
}
