package HomeWork2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Method {
    public static void main(String[] args) {
        setOfNumbersRemove();
    }

    public static void setOfNumbersRemove() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt(1000));
        }
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
