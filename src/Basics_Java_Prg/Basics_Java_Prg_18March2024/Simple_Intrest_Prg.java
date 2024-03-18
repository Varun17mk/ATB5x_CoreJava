package src.Basics_Java_Prg.Basics_Java_Prg_18March2024;

import java.util.Scanner;

public class Simple_Intrest_Prg {

    public static void main(String[] args) {
        float p,t,r, Simple_Intrest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount ");
        p = sc.nextFloat();
        System.out.println("Enter the Time period in years ");
        t = sc.nextFloat();
        System.out.println("Enter the Rate of Intrest in percentage ");
        r = sc.nextFloat();
        Simple_Intrest = (p*t*r)/100;
        System.out.println("Simpe_Intrest will be -->"+Simple_Intrest);
    }

}
