package src.Basics_Java_Prg._11June2024.Arrays;

import java.util.Arrays;

public class largest_element_in_an_array {
//    static int arr[] = {10, 20, 30, 40, 50};
//    public static void main(String[] args) {
//
//        System.out.println("Largest element in the given array is "+largest());
//    }
//
//
//    static int largest()
//    {
//        int i;
//        int max = arr[0];
//
//        for (i = 1; i < arr.length ; i++)
//        {
//            if(arr[i]>max)
//                max = arr[i];
//        }
//        return max;
//    }


// Or else sorting an array and printing last element is another method of finding largest element in an array
    //Pre Defined Function
    //We can use sort function is a sorting algorithm.


    public static void main(String[] args) {
        int arr[] = {12, 123,456,7894685,1};

        Arrays.sort(arr); // Inbuild function in Java to sort array

        //Printing the last element of arr as sorted array has largest element at last

        System.out.println("Largest element is "+arr[arr.length-1]);
    }
}

