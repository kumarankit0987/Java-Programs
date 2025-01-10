package DSA;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iteration {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        // Iterate the set using Iterator
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
