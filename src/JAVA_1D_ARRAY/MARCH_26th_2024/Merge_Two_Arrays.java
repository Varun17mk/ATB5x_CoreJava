package src.JAVA_1D_ARRAY.MARCH_26th_2024;

import java.io.*;

public class Merge_Two_Arrays {

    //Method 1: Using Predefined function
    //First, we initialize two arrays lets say array a and array b, then we will store values in both the arrays.
    //After that, we will calculate the length of arrays a and b and will store it into the variables lets say a1 and b1.
    // We need to calculate the length of the array because by using the length of these arrays we can predict the length of the resultant array in which the elements will be store after merging.
    //Then by using System.arraycopy(), we merge both the arrays and the result will be stored in the third array.

//    public static void main(String[] args)
//    {
//        // first array
//        int[] a = { 10, 20, 30, 40 };
//
//        // second array
//        int[] b = { 50, 60, 70, 80 };
//
//        // determines length of firstArray
//        int a1 = a.length;
//
//        // determines length of secondArray
//        int b1 = b.length;
//
//        // resultant array size
//        int c1 = a1 + b1;
//
//        // create the resultant array
//        int[] c = new int[c1];
//
//        // using the pre-defined function arraycopy
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);
//
//        // prints the resultant array
//        System.out.println(Arrays.toString(c));
//    }

    //---------------------------------------------------------------------------


    //Method 2: Without using pre-defined function
    //First, we initialize two arrays lets say array a and array b, then we will store values in both the array.
    //After that, we will calculate the length of both the arrays and will store it into the variables lets say a1 and b1.
    // We need to calculate the length of the array because by using the length of these arrays we can predict the length of the resultant array in which the elements will be store after merging.
    //Then the new array c which is the resultant array will be created.
    //Now, the first loop is used to store the elements of the first array into the resultant array one by one and the second for loop to store the elements of the second array into the resultant array one by one.
    //The final for loop is used to print the elements of the resultant array.
    public static void main(String[] args)
    {

        // first array
        int[] a = { 30, 25, 40 };
        // second array
        int[] b = { 45, 50, 55, 60, 65 };

        // determining length of first array
        int a1 = a.length;
        // determining length of second array
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the
            // resultant array
            c[a1 + i] = b[i];
        }

        // Loop to print the elements of
        // resultant array after merging
        for (int i = 0; i < c1; i = i + 1) {

            // print the element
            System.out.println(c[i]);
        }
    }

}
