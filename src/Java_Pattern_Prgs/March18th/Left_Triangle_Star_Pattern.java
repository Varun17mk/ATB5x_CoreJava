package src.Java_Pattern_Prgs.March18th;

import java.util.Scanner;

public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for rows
        for (int i=1; i<=n; i++)
        {

            for(int k=1; k<=n-i; k++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
