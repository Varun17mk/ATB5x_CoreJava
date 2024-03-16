package src.Basics_Java_Prg.Basics_Java_Prg_16March2024;

import java.util.Scanner;

public class Prime_nos_from_1_to_N {
    static void Prime_N(int N){ //Creating function of Prime_N

        int x, y, flag;

        System.out.println("All prime nos from 1 to "+N+" are :-");

        for(x=1; x<=N; x++){ //for loop to iterate from 1 to N

            // condition to omit 0 and 1 as they are neither prime nor composite
            if(x==1 || x==0)
                continue;

            flag = 1; // using flag to check the prime no or not

            for(y=2; y<=x/2; y++){
                if(x%y==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(x+" ");// lisitng of prime nos from 1 to N
            }

        }
    }

    public static void main(String[] args) {

        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        N = sc.nextInt();
        Prime_N(N);//Calling function Prime_N
    }
}
