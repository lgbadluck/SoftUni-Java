package _03_InheritanceLab._04_StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.removeLast();
    }

    public String peek () {
        return data.getLast();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
