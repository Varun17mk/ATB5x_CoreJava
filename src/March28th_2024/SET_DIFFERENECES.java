package src.March28th_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_DIFFERENECES {
    public static void main(String[] args) {

        // Hashset -- Randomly prints
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(1236);
        integerSet.add(147893);
        integerSet.add(null);// null can be added in hashset
        System.out.println(integerSet);

//-----------------------------------------------------

        // LinkedHashset -- Prints in order of which elements are entered
        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(1236);
        integerSet2.add(147893);
        integerSet2.add(null);// null can be added in hashset
        System.out.println(integerSet2);

        //---------------------------------------------------

        // Treeset -- Prints in sorted elements, null is not allowed
        Set<Integer> integerSet3 = new TreeSet<>();
        integerSet3.add(2);
        integerSet3.add(12);
        integerSet3.add(0);
        integerSet3.add(50);
//        integerSet3.add(null);// null can't be added in Treeset
        System.out.println(integerSet3);
    }
}
