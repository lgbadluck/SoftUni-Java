package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class PrivateImpl extends SoldierImpl implements Private, Comparable<PrivateImpl> {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Salary: ").append(String.format("%.2f", getSalary()));
        return sb.toString();
    }

    @Override
    public int compareTo(PrivateImpl o) {
        return o.getId() - this.getId();
    }
}
