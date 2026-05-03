package maths;

import java.util.Scanner;

public class prime_no {
    static boolean prime(int n){
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
            return isPrime;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();

    }
}
