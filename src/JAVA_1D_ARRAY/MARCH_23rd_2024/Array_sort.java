package src.JAVA_1D_ARRAY.MARCH_23rd_2024;

import java.util.Arrays;
import java.util.Collections; // Collections Framework

public class Array_sort {

    //Example 1:
//    public static void main(String args[])
//    {
//        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
//        System.out.println("The original array is: ");
//        for (int num : arr) {
//            //The line of code for (int num : arr) is an example of an enhanced for loop,
//            // also known as a for-each loop, in Java.
//            // This loop is specifically designed for iterating over elements in arrays or collections.
//            System.out.print(num + " ");
//        }
//        Arrays.sort(arr);
//        System.out.println("\nThe sorted array is: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }

    //--------------------------------------------------------------------

    //    Example 2:
        // Java Program to Sort Array of Integers
        // by Default Sorts in an Ascending Order
        // using Arrays.sort() Method
    //    public static void main(String[] args)
    //    {
    //    // Custom input array
    //    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
    //
    //    // Applying sort() method over to above array
    //    // by passing the array as an argument
    //    Arrays.sort(arr);
    //
    //    // Printing the array after sorting
    //    System.out.println("Modified arr[] : "
    //            + Arrays.toString(arr));
    //    }
//----------------------------------------------------------------------------------
    //    Example 3:
    //    public static void main(String[] args)
    //    {
    //        // Custom input array
    //        // It contains 8 elements as follows
    //        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
    //
    //        // Sort subarray from index 1 to 4, i.e.,
    //        // only sort subarray {7, 6, 45, 21} and
    //        // keep other elements as it is.
    //        Arrays.sort(arr, 1, 5);
    //
    //        // Printing the updated array which is
    //        // sorted after 2 index inclusive till 5th index
    //        System.out.println("Modified arr[] : "
    //                + Arrays.toString(arr));
    //    }

    //------------------------------------------------------------------------------


    //    Example 4:
    // Java program to Sort a Subarray in "Descending order"
    // Using Arrays.sort()
        // Importing Collections class and arrays classes
    // from java.util package
    // Main driver method
//    public static void main(String[] args)
//    {
//        // Note that we have Integer here instead of
//        // int[] as Collections.reverseOrder doesn't
//        // work for primitive types.
//        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
//
//        // Sorts arr[] in descending order using
//        // reverseOrder() method of Collections class
//        // in Array.sort() as an argument to it
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        // Printing the array as generated above
//        System.out.println("Modified arr[] : "
//                + Arrays.toString(arr));
//    }

    //--------------------------------------------------------------

//    Example 5:
    // Java program to sort an array of strings
    // in ascending and descending alphabetical order
    // Using Arrays.sort()
    //  Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String arr[] = { "Varun", "Karthik", "Sonu" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending Modified arr[] : "
                + Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("Descending Modified arr[] :"
                + Arrays.toString(arr));
    }

}
