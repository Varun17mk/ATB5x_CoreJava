package src.JAVA_1D_ARRAY.MARCH_26th_2024;

public class Remove_all_occurrences_of_an_element_from_Array_in_Java {
    public static void main(String[] args) {
        int[] B = {1, 2, 3, 4, 5, 2, 3, 5, 2, 6, 3};
        int key = 3;
        int rao=RAO(B, key);
        for (int i = 0; i < rao; i++) {
            System.out.print(B[i]+" ");
        }
    }

    private static int RAO(int[] B, int key) {
        int rao=0;
        for (int i = 0; i < B.length; i++)
        {
            if(B[i]!=key)
            {
                B[rao]=B[i];
                rao++;
            }
        }
        return rao;

    }
}
