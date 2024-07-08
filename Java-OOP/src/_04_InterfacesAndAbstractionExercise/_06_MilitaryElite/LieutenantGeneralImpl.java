package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<PrivateImpl> subordinates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.subordinates = new TreeSet<>();
    }

    public void addPrivate(PrivateImpl priv) {
        subordinates.add(priv);
    }

    @Override
    public Set<PrivateImpl> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator())
                .append("Privates:").append(System.lineSeparator());
        sb.append(subordinates.stream().map(priv -> String.format("  %s", priv.toString())).collect(Collectors.joining(System.lineSeparator())));
        //subordinates.stream().sorted().forEach(e -> sb.append(System.lineSeparator()).append("  ").append(e));
        return sb.toString().trim();
    }
}
