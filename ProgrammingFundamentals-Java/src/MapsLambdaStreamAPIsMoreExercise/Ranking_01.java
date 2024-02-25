package MapsLambdaStreamAPIsMoreExercise;

import java.util.*;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> credentialsMap = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<ContestPoints>> contestStatsMap = new LinkedHashMap<>();

        String contestInfo = scanner.nextLine();
        while (!contestInfo.equals("end of contests")) {
            String contestName = contestInfo.split(":")[0];
            String contestPassword = contestInfo.split(":")[1];
            credentialsMap.putIfAbsent(contestName, null);
            credentialsMap.put(contestName, contestPassword);
            contestInfo = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String contestName = input.split("=>")[0];
            String contestPassword = input.split("=>")[1];
            String userName = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);
            if (credentialsMap.containsKey(contestName)) {
                if (credentialsMap.get(contestName).equals(contestPassword)) {
                    contestStatsMap.putIfAbsent(userName, new ArrayList<>());
                    if (contestStatsMap.get(userName).isEmpty()) {
                        contestStatsMap.get(userName).add(new ContestPoints(contestName, points));
                    } else {
                        //Check if contestName exists in the List of Class ContestPoints object
                        boolean isPresentContest = false;
                        for (Map.Entry<String, ArrayList<ContestPoints>> entry : contestStatsMap.entrySet()) {
                            if (entry.getKey().equals(userName) ) {
                                for (Iterator<ContestPoints> it = entry.getValue().iterator(); it.hasNext(); ) {
                                    ContestPoints user = it.next();
                                    if (user.getContestName().equals(contestName)) {
                                        if (points > user.getPoints()) {
                                            user.setPoints(points);
                                        }
                                        //Found the contest either change with Higher Score (points) or not
                                        //But always Raise flag for found and break out of the for(iterator()) as only 1 entry for contestName should exist
                                        isPresentContest = true;
                                        break;
                                    }
                                }
                            }
                        }
                        // The constName and points is not present in the List of object (ContestPoints) so add new object to the list
                        if (!isPresentContest) {
                            contestStatsMap.get(userName).add(new ContestPoints(contestName, points));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        // Sort contestStatsMap by userName and the List of Contest by Amount of points in Descending order
        // Create a TreeMap and pass the LinkedHashMap as an argument
        TreeMap<String, ArrayList<ContestPoints>> sortedMap = new TreeMap<>(contestStatsMap);
        // Create a custom Comparator that compares the points of two ContestPoints objects
        Comparator<ContestPoints> pointsComparator = new Comparator<ContestPoints>() {
            @Override
            public int compare(ContestPoints o1, ContestPoints o2) {
                return o2.points - o1.points; // descending order
            }
        };
        // Sort each ArrayList in the TreeMap by the pointsComparator
        for (ArrayList<ContestPoints> list : sortedMap.values()) {
            list.sort(pointsComparator);
        }

        //Find best candidate - highest sum() of points
        String bestCandidate = "";
        int sumPointsBestCandidate = -1;
        for (Map.Entry<String, ArrayList<ContestPoints>> entry : sortedMap.entrySet()) {
            int tempSumPoints = 0;
            for (Iterator<ContestPoints> it = entry.getValue().iterator(); it.hasNext(); ) {
                ContestPoints user = it.next();
                tempSumPoints+=user.getPoints();
            }
            if (tempSumPoints>sumPointsBestCandidate) {
                bestCandidate = entry.getKey();
                sumPointsBestCandidate=tempSumPoints;
            }
        }

        System.out.printf("Best candidate is %s with total %d points.\nRanking: \n", bestCandidate, sumPointsBestCandidate);

        for (Map.Entry<String, ArrayList<ContestPoints>> entry : sortedMap.entrySet()) {
            System.out.printf("%s\n", entry.getKey());
            for (Iterator<ContestPoints> it = entry.getValue().iterator(); it.hasNext(); ) {
                ContestPoints user = it.next();
                System.out.printf("#  %s -> %d\n", user.getContestName(), user.getPoints());
            }
        }
    }

    public static class ContestPoints {
        private String contestName;
        private int points;

        public String getContestName() {
            return contestName;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public ContestPoints(String contestName, int points) {
            this.contestName = contestName;
            this.points = points;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ContestPoints that = (ContestPoints) o;
            return Objects.equals(this.getContestName(), that.getContestName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getContestName(), getPoints());
        }
    }
}
