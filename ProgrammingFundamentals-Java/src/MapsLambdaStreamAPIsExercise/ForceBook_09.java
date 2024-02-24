package MapsLambdaStreamAPIsExercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> forceSidesMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> forceUsersMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String force_side = input.split("\\|")[0].trim();
                String force_user = input.split("\\|")[1].trim();

                if (forceUsersMap.containsKey(force_user)) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    forceSidesMap.putIfAbsent(force_side, new ArrayList<String>());
                    forceSidesMap.get(force_side).add(force_user);
                    forceUsersMap.putIfAbsent(force_user, null);
                    forceUsersMap.put(force_user, force_side);
                }
            } else if (input.contains("->")) {
                String force_user = input.split("->")[0].trim();
                String force_side = input.split("->")[1].trim();

                if (forceUsersMap.containsKey(force_user)) {
                    // Looking up the correct key (force_side) from forceUsersMap go and remove the force_user from forceSidesMap List
                    String userIsAlreadyOnForceSide = forceUsersMap.get(force_user);
                    forceSidesMap.get(userIsAlreadyOnForceSide).remove(force_user);
                    // Add it to the new force_side (create if not present)
                    forceSidesMap.putIfAbsent(force_side, new ArrayList<String>());
                    forceSidesMap.get(force_side).add(force_user);
                    // Change the forceUsersMap to have correct force_side (change sides) and create side if not present
                    forceUsersMap.putIfAbsent(force_user, null);
                    forceUsersMap.put(force_user, force_side);
                } else {
                    // Add it to the new force_side (create if not present)
                    forceSidesMap.putIfAbsent(force_side, new ArrayList<String>());
                    forceSidesMap.get(force_side).add(force_user);
                    // Change the forceUsersMap to have correct force_side (change sides) and create side if not present
                    forceUsersMap.putIfAbsent(force_user, null);
                    forceUsersMap.put(force_user, force_side);
                }
                System.out.println(force_user + " joins the " + force_side + " side!");
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : forceSidesMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d", entry.getKey(), entry.getValue().size());
                System.out.printf("%s", entry.getValue().toString().trim()
                        .replace("[", "\n! ")
                        .replace(",", "\n!")
                        .replace("]", "\n"));
            }
        }
    }
}
