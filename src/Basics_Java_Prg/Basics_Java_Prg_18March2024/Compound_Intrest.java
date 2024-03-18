package src.Basics_Java_Prg.Basics_Java_Prg_18March2024;

import java.util.Scanner;

public class Compound_Intrest {
    public static void main(String[] args) {
        double p, t, r, CI;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Principle amount in RS");
        p = sc.nextFloat();
        System.out.println("Enter the value of Time t in years");
        t = sc.nextFloat();
        System.out.println("Enter the value of Rate of intrest in RS");
        r = sc.nextFloat();

//        CI = p((1+(r/100))^t); ^t cant be used in float REMEMBER THIS
         CI = p*(Math.pow((1+r/100),t));
        System.out.println("Compound Intrest is -> "+CI);
    }
}
