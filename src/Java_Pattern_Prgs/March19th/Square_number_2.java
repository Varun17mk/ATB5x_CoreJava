package src.Java_Pattern_Prgs.March19th;

import java.util.Scanner;
/*
prining pattern
12345
12345
12345
12345
12345
 */
public class Square_number_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Square in N");
        int n =sc.nextInt();

        for (int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
