package lang.tij4.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection =
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        // Runs significantly faster, but you can't
        // CONSTRUCT a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
        // list.add(21); // Runtime error because the underlying
        // array cannot be resized.
        // Produces a list "backed by" an ArrayList,
        // which is more flexible.
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(16, 17, 18, 19, 20));
        list2.add(21);
        list2.set(0, 99);
    }

}
