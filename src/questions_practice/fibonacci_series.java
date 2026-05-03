package questions_practice;
import java.util.Scanner;

public class fibonacci_series {
    static void fibonacci(int n){
        int a=0;
        int b=1;
        int c;
        if(n<=0){
            return;
        }
        if(n==1){
            System.out.println(a);
            return;
        }
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);

    }
}
