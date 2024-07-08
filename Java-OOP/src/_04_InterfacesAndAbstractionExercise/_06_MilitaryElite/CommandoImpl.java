package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommandoImpl extends SpecialisedSoldierImpl {
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public Set<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        sb.append(missions.stream().map(Mission::toString).collect(Collectors.joining(System.lineSeparator())));
        return sb.toString().trim();
    }
}
