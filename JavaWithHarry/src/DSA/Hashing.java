package DSA;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        // create a HashSet
        HashSet<Integer> set = new HashSet<>();
        // Add elements in set
        set.add(12);
        set.add(18);
        set.add(19);
        set.add(23);

        // search - contains();
        boolean result = set.contains(12);
        System.out.println(result);

        // size - size()
        System.out.println(set.size());
    }
}
