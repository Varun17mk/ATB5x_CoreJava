package src.OOPS_10_March_2024;

import java.util.Scanner;

public class Lab_002 {
    public static void main(String[] args) {
        //// PRG for Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        String userinput = sc.next();
        boolean result = ispalindrome(userinput);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    private static boolean ispalindrome(String userinput) {
        String original_str = userinput;
        StringBuilder sb = new StringBuilder(userinput);
        sb.reverse();
        return original_str.equalsIgnoreCase(sb.toString());
    }


}
