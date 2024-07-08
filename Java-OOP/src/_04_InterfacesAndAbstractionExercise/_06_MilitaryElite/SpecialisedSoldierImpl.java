package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public String getCorps () {
        return corps.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator()).
                append("Corps: ").append(getCorps());
        return sb.toString();
    }
}
