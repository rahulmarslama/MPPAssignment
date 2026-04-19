package Lab13.prob5;

import java.util.List;

public class Prob5
{
    public static <T extends Comparable<? super T>> T secondSmallest(List<? extends T> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must have at least 2 elements");
        }

        T smallest = null;
        T second = null;

        for (T elem : list) {
            if (smallest == null || elem.compareTo(smallest) < 0) {
                second = smallest;
                smallest = elem;
            } else if (second == null || elem.compareTo(second) < 0) {
                second = elem;
            }
        }

        return second;
    }
}
