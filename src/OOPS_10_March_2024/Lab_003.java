package src.OOPS_10_March_2024;

// PRG for palindrome without using stringbuilder
public class Lab_003 {
    public static void main(String[] args) {
        String name = "Varun";

        //creating empty string.

        String A = " ";

        for (int i = name.length()-1; i>=0 ; i--){
            A = A + name.charAt(i);
        }
        System.out.println(A);
        System.out.println(name.length());
    }
}
