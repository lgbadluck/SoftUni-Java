package ObjectsAndClassesMoreExercise;

import java.util.*;

public class TeamworkProjects_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> creatorsList = new ArrayList<>();
        List<String> teamNamesList = new ArrayList<>();
        List<String> membersAlreadyInTeam = new ArrayList<>();
        List<Team> teamList = new ArrayList<>();

        while (n > 0) {
            String[] input = scanner.nextLine().split("-");
            //System.out.println(Arrays.stream(input).toList());
            String teamNameToBeCreated = input[1];
            String creatorName = input[0];
            if (teamNamesList.contains(teamNameToBeCreated)) {
                System.out.println("Team " + teamNameToBeCreated + " was already created!");
            } else if (creatorsList.contains(creatorName)) {
                System.out.println(creatorName + " cannot create another team!");
            } else {
                Team teamToAdd = new Team(teamNameToBeCreated, creatorName);
                teamList.add(teamToAdd);
                teamNamesList.add(teamNameToBeCreated);
                membersAlreadyInTeam.add(creatorName);
                creatorsList.add(creatorName);
            }

            n--;
        }
        String input = scanner.nextLine();
        while (!input.equals("end of assignment")) {
            String[] command = input.split("->");
            String joiningMember = command[0];
            String addedInTeamName = command[1];
            if (!teamNamesList.contains(addedInTeamName)) {
                System.out.println("Team " + addedInTeamName + " does not exist!");
            } else if (creatorsList.contains(joiningMember) || membersAlreadyInTeam.contains(joiningMember)) {
                System.out.println("Member " + joiningMember + " cannot join team " + addedInTeamName + "!");
            } else {
                membersAlreadyInTeam.add(joiningMember);
                for (Team team : teamList) {
                    if (team.getTeamName().matches(addedInTeamName)) team.getMembersList().add(joiningMember);
                }
            }
            input = scanner.nextLine();
        }

        // Sort the list by countMembers (descending) and then by teamName (ascending)
        Collections.sort(teamList, Comparator
                .comparingInt(Team::getCountMembers)
                .reversed()
                .thenComparing(Team::getTeamName));

        //Collections.sort(teamList, (team1, team2) -> Integer.compare(team2.getMembersList().size(), team1.getMembersList().size()));
        for (Team team : teamList) {
            if(!team.membersList.isEmpty()) {
                team.printMembers();
            }
        }

        System.out.println("Teams to disband:");
        for (Team team : teamList) {
            if (team.getMembersList().isEmpty()) {
                System.out.println(team.getTeamName());
                teamNamesList.remove(team.getTeamName());
                creatorsList.remove(team.getCreator());
            }
        }
    }

    public static class Team {
        String       teamName;
        String       creator;
        List<String> membersList = null;

        public Team(String teamName, String creator) {
            this.teamName = teamName;
            this.creator = creator;
            this.membersList = new ArrayList<>();
            System.out.println("Team " + this.teamName + " has been created by " + this.creator + "!");
        }

        public void joinMember(String newMemberName) {
            membersList.add(newMemberName);
        }

        public void printMembers() {
            System.out.println(teamName);
            System.out.println("- " + creator);
            Collections.sort(membersList);
            for (String memberName : membersList) {
                System.out.println("-- " + memberName);
            }
        }

        public String getTeamName() {
            return teamName;
        }

        public String getCreator() {
            return creator;
        }

        public List<String> getMembersList() {
            return membersList;
        }
        public int getCountMembers() {
            return membersList.size();
        }
    }
}
