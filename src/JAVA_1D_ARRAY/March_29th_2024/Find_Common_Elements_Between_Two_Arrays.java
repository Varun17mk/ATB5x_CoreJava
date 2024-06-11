package src.JAVA_1D_ARRAY.March_29th_2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        // create Array 1
        String[] arr1
                = { "Varun", "in", "Accenture", "for", "Work" };

        // create Array 2
        String[] arr2 = { "Accenture", "for", "Geeks" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElement(arr1, arr2);
    }


    public static void FindCommonElement(String arr1[], String arr2[])
    {
        Set<String> set = new HashSet<>();
        for (int i=0; i< arr1.length; i++)
        {
            for (int j=0; j< arr2.length; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
    }
}

}
