package MapsLambdaStreamAPIsMoreExercise;

import java.util.*;

public class Judge_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, Integer>> userNamePointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, TreeMap<String, Integer>> contestStatsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String userName = input.split("-")[0].trim();
            String contestName = input.split("->")[1].trim();
            int points = Integer.parseInt(input.split("->")[2].trim());

            userNamePointsMap.putIfAbsent(userName, new TreeMap<>());
            userNamePointsMap.get(userName).putIfAbsent(contestName, 0);
            if (points > userNamePointsMap.get(userName).get(contestName))
                userNamePointsMap.get(userName).put(contestName, points);

            contestStatsMap.putIfAbsent(contestName, new TreeMap<>());
            contestStatsMap.get(contestName).putIfAbsent(userName, 0);
            if (points > contestStatsMap.get(contestName).get(userName)) {
                contestStatsMap.get(contestName).put(userName, points);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : contestStatsMap.entrySet()) {
            System.out.printf("%s: %d participants\n", entry.getKey(), entry.getValue().size());
            // Convert the map's entrySet into a List of entries
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entry.getValue().entrySet());
            // Sort the List using Collections.sort() method with a custom Comparator that compares the values of the entries in reverse order
            entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
            int count = 1;
            for (Map.Entry<String, Integer> e : entryList) {
                System.out.printf("%d. %s <::> %d\n", count++, e.getKey(), e.getValue());
            }
        }
        // Create a new TreeMap of Integer to store the result
        TreeMap<String, Integer> userPointsMap = new TreeMap<>();

        // Iterate over the entries of the LinkedHashMap of TreeMap
        for (Map.Entry<String, TreeMap<String, Integer>> entry : userNamePointsMap.entrySet()) {
            // Get the key and the value (which is a TreeMap of Integer)
            String user = entry.getKey();
            TreeMap<String, Integer> points = entry.getValue();
            // Alternatively, you can use a stream to sum the values
            int sum = points.values().stream().mapToInt(Integer::intValue).sum();
            // Put the key and the sum into the result TreeMap
            userPointsMap.put(user, sum);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(userPointsMap.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println("Individual standings:");
        int count = 1;
        for (Map.Entry<String, Integer> e : entryList) {
            System.out.printf("%d. %s -> %d\n", count++, e.getKey(), e.getValue());
        }
    }
}
