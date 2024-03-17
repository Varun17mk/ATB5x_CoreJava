package src.Basics_Java_Prg.Basics_Java_Prg_17March2024;

// If the sum of digits of square of a number is equal to number, then the number is called Neon number.
// if 9*9=81 and 8+1 = 9; then 9 is neon number.


import java.util.Scanner;

public class Neon_Prg {

    // Function for neon number logic
    static void Neon(int N){

        int Square = N*N;
        int sum = 0;

        while(Square>0)
        {
            int r=Square%10; // taking out last digit  and storing in sum.
            sum = sum+r;
            Square = Square/10; // storing only 1st digit
        }

        if (N==sum)
        {
            System.out.println("Hurray!! its Neon number");
        }
        else
        {
            System.out.println("Oops!! Its not a Neon number");
        }
    }


    public static void main(String[] args) {
        int N;
        System.out.println("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Neon(N);
    }
}
