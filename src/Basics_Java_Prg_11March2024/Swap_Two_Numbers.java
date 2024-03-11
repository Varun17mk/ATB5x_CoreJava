package src.Basics_Java_Prg_11March2024;

import java.util.Scanner;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        // Creating scanner class to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number - ");
        int I1 = sc.nextInt();
        System.out.println("Enter the Second number - ");
        int I2 = sc.nextInt();

        System.out.println("The value of I1 is "+I1+ " and I2 is "+I2+ " BEFORE swapping ");
        //Creating empty integer and intitialisng to Zero
        int I3;

        I3 = I1;
        I1 = I2;
        I2 = I3;

        System.out.println("The value of I1 is "+I1+ " and I2 is "+I2+ " AFTER swapping ");


    }
}
