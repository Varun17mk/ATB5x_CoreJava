package src.Java_Pattern_Prgs.March18th;

import java.util.Scanner;

public class Downward_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for rows
        for (int i=1; i<=n; i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
