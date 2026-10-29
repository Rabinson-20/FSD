package Oct29;

import java.util.*;
import java.util.ArrayList;

public class HashSetTask {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // 1. Test Insertion Order
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("Elements: " + set);
        System.out.println("Insertion Order: Not Guaranteed");

        // 2. Test Duplicate Elements
        set.add(10);
        System.out.println("After adding duplicate 10: " + set);
        System.out.println("Size: " + set.size());

        // 3. Test Sorting
        System.out.println("Before sorting: " + set);

        ArrayList<Integer> list = new ArrayList<>(set);
        java.util.Collections.sort(list);

        System.out.println("After sorting: " + list);

        // 4. Test Null Elements
        set.add(null);
        System.out.println("After adding null: " + set);
        System.out.println("Contains null: " + set.contains(null));
    }
}