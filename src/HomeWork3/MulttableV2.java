package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MulttableV2 {
    public static void main(String[] args) {
        List<Pair> allPairs = new ArrayList<>();
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                allPairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<Pair> chosenPairs = allPairs.subList(0, 15);
        System.out.println(chosenPairs);
    }
}

class Pair {
    public int first;
    public int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + "*" + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}




