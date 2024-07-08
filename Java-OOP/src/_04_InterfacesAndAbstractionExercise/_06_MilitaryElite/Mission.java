package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class Mission {
    private String codeName;
    private MissionProgress state;

    public Mission(String codeName, MissionProgress state) {
        this.codeName = codeName;
        this.state = state;
    }
    public Mission(String codeName) {
        this.codeName = codeName;
        this.state = MissionProgress.inProgress;
    }

    public void completeMission() {
        this.state = MissionProgress.inProgress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  Code Name: ").append(codeName).append(" ").append("State: ").append(state);
        return sb.toString();
    }
}
