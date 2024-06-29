package _02_EncapsulationExercise._05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;

    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<Player>();
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(String playerName) {
        Player playerToRemove = null;
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                playerToRemove = player;
                break;
            }
        }
        if (playerToRemove == null) {
            //throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
            System.out.println("Player " + playerName + " is not in " + this.name + " team.");
        } else {
            players.remove(playerToRemove);
        }
    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
