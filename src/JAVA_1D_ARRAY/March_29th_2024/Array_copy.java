package src.JAVA_1D_ARRAY.March_29th_2024;

import java.util.Arrays;

public class Array_copy {

//    1. Iterating each element of the given original array and copy one element at a time

//    public static void main(String[] args) {
//        int a[] = {1, 2, 3};
//        int b[] = new int[a.length]; // Creating an empty array of same length of a[]
//        System.out.println("Array a: "+Arrays.toString(a));
//
//        for (int i=0; i< a.length; i++)
//        {
//            // Copying elements of a[] to b[]
//            b[i]=a[i];
//        }
//
//        b[0]++;// Incrementing 1st value to check it wont affect a.
//
//        System.out.println("Array b: "+Arrays.toString(b));
//    }

    //---------------------------------------------------------------------

        //    Method 2: Using Clone() method
        // Main driver method
        //public static void main(String[] args)
        //{
        //    // Input array a[]
        //    int a[] = { 1, 8, 3 };
        //
        //    // Copying elements of a[] to b[]
        //    int b[] = a.clone();
        //
        //    // Changing b[] to verify that
        //    // b[] is different from a[]
        //    b[0]++;
        //
        //    // Display message for better readability
        //    System.out.println("Contents of a[] ");
        //
        //    for (int i = 0; i < a.length; i++)
        //        System.out.print(a[i] + " ");
        //
        //    // Display message for better readability
        //    System.out.println("\n\nContents of b[] ");
        //
        //    for (int i = 0; i < b.length; i++)
        //        System.out.print(b[i] + " ");
        //    System.out.println();
        //
        //    // to print array
        //    System.out.println("Array b: "+Arrays.toString(b));


//      Method 4: Using copyOf() method of Arrays class

    public static void main(String[] args)
    {
        // Custom input array
        int a[] = { 1, 8, 3 };

        // Create an array b[] of same size as a[]
        // Copy elements of a[] to b[]
        int b[] = Arrays.copyOf(a, 3);

        // Change b[] to verify that
        // b[] is different from a[]
        b[0]++;

        System.out.println("Contents of a[] ");

        // Iterating over array. a[]
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[] ");

        // Iterating over array b[]
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }


}


