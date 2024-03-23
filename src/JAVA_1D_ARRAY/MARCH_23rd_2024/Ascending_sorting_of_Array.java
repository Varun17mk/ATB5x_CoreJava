package src.JAVA_1D_ARRAY.MARCH_23rd_2024;

import java.util.Arrays;
public class Ascending_sorting_of_Array {
    public static void main(String[] args) {
        int B[] = {1, 2, 3, 4, 5, 10};

        // Displaying the array
        System.out.println("Elements of original array are : ");
        for (int i = 0; i <B.length ; i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println();
        Arrays.sort(B);

        System.out.println("Elements after sorting are - "+Arrays.toString(B));
    }

}
