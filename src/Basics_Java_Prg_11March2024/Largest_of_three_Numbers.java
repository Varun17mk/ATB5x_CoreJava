package src.Basics_Java_Prg_11March2024;

import java.util.Scanner;

public class Largest_of_three_Numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the 1st number --> ");
        int I1 = sc.nextInt();

        System.out.println("Enter the 2nd number --> ");
        int I2 = sc.nextInt();

        System.out.println("Enter the 3rd number --> ");
        int I3 = sc.nextInt();

        // Logic for the comparing the largest of 3 numbers
        if(I1>I2 && I1>I3){
            System.out.println("1st number--> "+I1+" is greatest of all");
        } else if (I2>I1 && I2>I3) {
            System.out.println("2nd number--> "+I2+" is greatest of all");
        }else{
            System.out.println("3rd number "+I3+" is greatest of all");
        }


    }
}
