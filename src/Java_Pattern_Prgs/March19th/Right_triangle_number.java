package src.Java_Pattern_Prgs.March19th;

/*
print

1
12
123
1234
12345
 */
public class Right_triangle_number {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
