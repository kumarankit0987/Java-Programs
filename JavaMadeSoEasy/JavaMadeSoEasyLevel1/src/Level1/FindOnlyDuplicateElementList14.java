package Level1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindOnlyDuplicateElementList14 {
    public static void main(String[] args) {
        // Create a ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(12);
        list.add(23);
        list.add(32);

        System.out.println(list);

        // convert list into set because set doesn't contain any duplicates elements
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        System.out.println(set);
    }
}
