package IteratorsAndComparatorsExercises._09_LinkedListTravesal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class CustomLinkedList implements Iterable<Integer> {

    private List<Integer> customList = new LinkedList<>();

    public CustomLinkedList() {
        this.customList = new LinkedList<>();
    }

    public void addElement(Integer num) {
        customList.add(num);
    }

    public boolean removeElement(Integer num) {
        if (customList.contains(num)) {
            customList.remove(num);
            return true;
        } else return false;
    }

    public Integer getSize() {
        return customList.size();
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            private Integer index = 0;


            @Override
            public boolean hasNext() {
                return index <= getSize() - 1;
            }

            @Override
            public Integer next() {
                Integer number = customList.get(index);
                index++;
                return number;
            }
        };

    }

    public void forEach() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(customList.get(i) + " ");
        }
    }
}