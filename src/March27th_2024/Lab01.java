package src.March27th_2024;

// Differenece between Hashset, LinkedHashset and Treeset

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Lab01 {
    public static void main(String[] args) {
//        Set courseSets = new TreeSet();// Treeset stores in sorted order
//        courseSets.add("Varun");
//        courseSets.add("Abhishek");
//        courseSets.add("Aditya");
//        courseSets.add("Prajwal");

        Set courseSets = new HashSet();// HashSet stores in randomised order
        courseSets.add("Varun");
        courseSets.add("Abhishek");
        courseSets.add("Aditya");
        courseSets.add("Prajwal");

        System.out.println(courseSets);

    }
}
