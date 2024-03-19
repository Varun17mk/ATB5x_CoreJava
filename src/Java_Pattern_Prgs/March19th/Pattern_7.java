package src.Java_Pattern_Prgs.March19th;

/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<2*n; i++)
        {
            if(i<=n)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for (int j=1; j<=(2*n)-i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
