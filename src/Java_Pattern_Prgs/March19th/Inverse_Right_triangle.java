package src.Java_Pattern_Prgs.March19th;


/*
print

*****
****
***
**
*

 */
public class Inverse_Right_triangle {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
