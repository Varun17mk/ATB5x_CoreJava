package src.Java_Pattern_Prgs.March19th;

/*
print
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */
public class Pattern_9 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <=5 ; i++)
        {
             for (int j=1; j<=n-i; j++) //for spaces
             {
                 System.out.print("  ");
             }

            for (int j = i; j >=1 ; j--) // for left part
            {
                System.out.print(j+" ");
            }

            for(int j=2; j<=i; j++) // for right part
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
