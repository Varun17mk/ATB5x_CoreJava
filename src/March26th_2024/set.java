package src.March26th_2024;

import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Jackfruit");
        fruits.add("Apple");
//        fruits.add(12) cant add integers as we have specified that the set contains of Strings only
        fruits.add("Orange");


        System.out.println(fruits); // set stores only unique values
        System.out.println(fruits.size());
        System.out.println(fruits.contains("apple")); // is case-sensitive
        System.out.println(fruits.contains("Apple"));
    }
}
