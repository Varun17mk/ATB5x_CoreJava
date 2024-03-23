package src.JAVA_1D_ARRAY.MARCH_23rd_2024;

import java.util.Arrays;

public class Largest_in_Array {

    // Using Brute force method

    // Array declaration
//    static int A[] = {10, 20, 50, 100};
//    static int Largest() // Method to find maximum in arr[]
//    {
//        int i;
//
//        int max = A[0]; // Initialise maximum element
//
//        // Traverse array elements from second and
//        // compare every element with current max
//        for (i=1; i< A.length; i++)
//        {
//            if(A[i] > max)
//            {
//                max = A[i];
//            }
//        }
//        return max;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Largest of the given array elements is - "+Largest());
//    }



//    2. Using Java 8 Stream
//public static void main(String[] args) {
//    int B[] = {10, 20, 30, 45, 50};
//    int max = Arrays.stream(B).max().getAsInt();
//    System.out.println("Largest of the Array B is -> "+max);
//}


//    Pre Defined Function
public static void main(String[] args)
{
    int arr[] = { 12,   45,  67,  89,  100, 23, 3456, 897, 452, 444, 899, 700 };

    // Sorting function using
    // Sort function
    Arrays.sort(arr);

    // Printing the Result
    System.out.println(
            "Largest number from given array: "
                    + arr[arr.length - 1]);
}
}
