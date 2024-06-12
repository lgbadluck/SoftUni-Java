package IteratorsAndComparatorsExercises._07_EquallityLogic;

import java.util.Comparator;

public class PersonNameComparator2 implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int compareName = CharSequence.compare(firstPerson.getName(), secondPerson.getName());
        if (compareName != 0) {
            return compareName;
        } else {
            return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
        }
    }
}