package src.Java_Pattern_Prgs.March19th;

import java.util.Scanner;

public class Square_Star {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Square in N");
        int n =sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
