/*
 (Min/Max
 */



import java.util.Set;
import java.util.Iterator;

public class GenericSetUtil {

    // Find the minimum key in the set
    public static <T extends Comparable<T>> T findMinKey(Set<T> set) {
        Iterator<T> iterator = set.iterator();
        T minKey = iterator.next();
        while (iterator.hasNext()) {
            T currentKey = iterator.next();
            if (currentKey.compareTo(minKey) < 0) {
                minKey = currentKey;
            }
        }
        return minKey;
    }

    // Find the maximum key in the set
    public static <T extends Comparable<T>> T findMaxKey(Set<T> set) {
        Iterator<T> iterator = set.iterator();
        T maxKey = iterator.next();
        while (iterator.hasNext()) {
            T currentKey = iterator.next();
            if (currentKey.compareTo(maxKey) > 0) {
                maxKey = currentKey;
            }
        }
        return maxKey;
    }
}

