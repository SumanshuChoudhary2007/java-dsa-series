package maths;

import java.util.Scanner;

public class pallindrome_number {
    static void pallindrome(int n){
        int temp=n;
        int rev=0;
        int last;
        while(n!=0){
            last=n%10;
            rev=(rev*10)+last;
            n/=10;
        }
        if(rev==temp){
            System.out.println("no. is pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        pallindrome(num);

    }
}
