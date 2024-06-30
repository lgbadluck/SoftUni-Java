package _03_InheritanceLab._03_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {
    public Object getRandomElement() {

        Random randomNumber = new Random();
        return super.get(randomNumber.nextInt(1000)%super.size());
    }
}
