package src.Java_Pattern_Prgs.March18th;

import java.util.Scanner;

public class Right_Triangle_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Iteration for_loop for printing *
        for(int i=1; i<=n; i++) // for rows
        {
            for(int j=1; j<=i; j++) // for columns
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
