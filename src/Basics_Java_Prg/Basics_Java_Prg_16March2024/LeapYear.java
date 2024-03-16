package src.Basics_Java_Prg.Basics_Java_Prg_16March2024;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int Year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check the leap year");
        Year = sc.nextInt();

        if((Year%4==0 && Year%100!=0) || (Year%400 == 0)){
            System.out.println("Hurray!! is a Leap Year");
        }
        else {
            System.out.println("Oops!! Its not a Leap year");
        }

    }
}
