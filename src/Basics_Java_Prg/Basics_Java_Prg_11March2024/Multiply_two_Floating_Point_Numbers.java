package src.Basics_Java_Prg.Basics_Java_Prg_11March2024;

import java.util.Scanner;

public class Multiply_two_Floating_Point_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float f1;
        System.out.println("Enter the value of f1");
        f1 = sc.nextFloat();

        float f2;
        System.out.println("Enter the value of f2");
        f2 = sc.nextFloat();

        float f3 = f1*f2;
        System.out.println("The product of 2 float numbers is : "+f3);



    }
}
