package src.Java_Pattern_Prgs.March19th;

/*
Print

    1
  2 1 2
3 2 1 2 3
  2 1 2
    1

 */
public class Pattern_10 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <=(2*n)-1 ; i++)
        {
            if(i<=n) {
                for (int j = 1; j <= n - i; j++) //for spaces
                {
                    System.out.print("  ");
                }

                for (int j = i; j >= 1; j--) // for left part
                {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) // for right part
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            else // for downtriangle
            {
                for (int j = 1; j <= i - n; j++) //for spaces
                {
                    System.out.print("  ");
                }

                for (int j =2*n-i; j >=1; j--) // for left part
                {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <=2*n-i; j++) // for right part
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

    }
}
