package src.Java_Pattern_Prgs.March19th;

import java.util.Scanner;

// printing
/* 1 1 1 1 1
   2 2 2 2 2
   3 3 3 3 3
   4 4 4 4 4
   5 5 5 5 5
 */
public class Square_number_Prg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Square in N");
        int n =sc.nextInt();

        for (int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
