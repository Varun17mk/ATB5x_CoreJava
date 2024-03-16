package src.Basics_Java_Prg.Basics_Java_Prg_16March2024;

import java.util.Scanner;

public class LCM_of_2nos {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number");
        n2 = sc.nextInt();

        int lcm = Math.max(n1, n2); // Math.max is inbuilt java function to find maximum or largest of 2 nos
//        int lcm = (n1>n2)? n1:n2; // Logic to find largest number between 2 nos without using max function.
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
