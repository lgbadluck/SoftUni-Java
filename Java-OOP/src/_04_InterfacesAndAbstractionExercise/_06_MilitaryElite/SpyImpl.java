package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Code Number: ").append(getCodeNumber());
        return sb.toString();
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }
}
