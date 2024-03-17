package src.Basics_Java_Prg.Basics_Java_Prg_17March2024;

import java.util.Scanner;

public class Factorial_Prg {

    static void Factorial(int f)
    {
        int fact = 1;

//        for (int i=f; i>0; i--)
        for (int i=1; i<=f; i++) // both for loop can be used
        {
            fact*=i;
        }
        System.out.println("The factorial of "+f+" is -> "+fact);
    }

    public static void main(String[] args) {
        int f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial - ");
        f=sc.nextInt();
        Factorial(f);
    }
}
