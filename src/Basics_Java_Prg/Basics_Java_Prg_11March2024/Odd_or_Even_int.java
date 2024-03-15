package src.Basics_Java_Prg.Basics_Java_Prg_11March2024;

import java.util.Scanner;

public class Odd_or_Even_int {
    public static void main(String[] args) {
        Scanner I1 = new Scanner(System.in);
        System.out.println("Enter the number to check - ");
        int num = I1.nextInt();

        // Logic for even number
        if(num % 2 == 0){
            System.out.println("It is even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}
