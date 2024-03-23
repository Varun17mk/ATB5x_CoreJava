package src.JAVA_1D_ARRAY.MARCH_23rd_2024;

import java.util.*;
public class Descending_sorting_of_Array {

    //1. Using Collections.reverseOrder() method
    //Array elements can be sorted in descending order by passing in the array and
    // Collections.reverseOrder() as parameters to Arrays.sort().
//    public static void main(String[] args) {
//        Integer array[] = {1, 2, 3, 4, 5}; // Its not primitive data type its "Wrapper class".
//        // Sorting the array in descending order
//        Arrays.sort(array, Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(array));
//    }

    //2. Using Sorting and Reversing
    public static void main(String[] args)
    {
        // Initializing the array
        int array[] = { 1, 2, 3, 4, 5, 6 };

        // Sorting the array in ascending order
        Arrays.sort(array);

        // Reversing the array
        reverse(array);

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array)
    {
        // Length of the array
        int n = array.length;

        // Swapping the first half elements
        // With last Half Elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half
            // to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
            array[n - i - 1] = temp;
        }
    }
}
