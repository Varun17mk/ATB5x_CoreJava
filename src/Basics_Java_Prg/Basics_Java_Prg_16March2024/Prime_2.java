package src.Basics_Java_Prg.Basics_Java_Prg_16March2024;

import java.util.Scanner;
// diff approach where eliminating numbers which we already know
public class Prime_2 {
    static boolean isPrime(int N){
        if (N==0 || N==1){
            return false;
        }

        if(N==2 || N==3 ){
            return true;
        }

        if(N%2==0 || N%3==0){ // all even numbers except 2 are composite.
            return false;
        }

        for(int i=5; i<=N/2; i++){ // prime number can be checked from 5
            if(N%i==0){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isPrime(N));
    }
}
