package _02_EncapsulationExercise._05_FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        double skillLevel = 0;

        skillLevel = (endurance + sprint + dribble + passing + shooting) / 5.0;

        return skillLevel;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            //throw new IllegalArgumentException("A name should not be empty.");
            System.out.println("A name should not be empty.");
            return;
        }
        this.name = name;
    }

    private boolean validateStat(int statValue, String statName) {
        if (statValue < 0 || statValue > 100) {
            System.out.println(statName + " should be between 0 and 100.");
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
        return true;
    }

    private void setEndurance(int endurance) {
        if (validateStat(endurance, "Endurance")) {
            this.endurance = endurance;
        }
    }

    private void setSprint(int sprint) {
        validateStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStat(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStat(shooting, "Shooting");
        this.shooting = shooting;
    }
}
