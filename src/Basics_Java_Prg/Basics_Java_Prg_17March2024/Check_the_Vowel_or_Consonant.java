package src.Basics_Java_Prg.Basics_Java_Prg_17March2024;

import java.util.Scanner;

public class Check_the_Vowel_or_Consonant {

    static void VowelCheck(char y)
    {
        if(y =='a' || y == 'e'|| y =='i' || y=='o'|| y=='u')
        {
            System.out.println("Hurray!! its a Vowel");
        }
        else
        {
            System.out.println("Yay!! its a Consonant");
        }
    }

    public static void main(String[] args) {
        char y ='u';
        VowelCheck(y);
    }



}
