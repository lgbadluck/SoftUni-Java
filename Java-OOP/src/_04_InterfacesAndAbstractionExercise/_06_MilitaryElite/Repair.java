package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  Part Name: ").append(partName).append(" ").append("Hours Worked: ").append(hoursWorked);
        return sb.toString();
    }
}
