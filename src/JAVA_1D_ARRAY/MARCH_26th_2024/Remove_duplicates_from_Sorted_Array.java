package src.JAVA_1D_ARRAY.MARCH_26th_2024;

//import java.util./

//Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
//Output: arr[] = {1, 2, 3, 4, 5}

// Not creating any new array, playing and assigning in the same array itself

public class Remove_duplicates_from_Sorted_Array {
/// Function to remove duplicate elements This function
    // returns new size of modified array.

    private static int removeDuplicates(int arr[])
    {
        int rd=0; // rd --> index of unique array
        for (int i = 1; i < arr.length; i++) // so iterating from 2nd element
        {
            if(arr[rd]!=arr[i])
                rd++;
                arr[rd]=arr[i];
        }
        return rd+1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

       int rd = removeDuplicates(arr);
        System.out.println();

        // to print Unique array
        for (int i = 0; i < rd; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
