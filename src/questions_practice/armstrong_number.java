package questions_practice;
import java.util.Scanner;

public class armstrong_number {
    static void armstrong(int n){
        int temp=n;
        int num=0;
        int last;
        while(n!=0){
            last=n%10;
            num+=last*last*last;
            n/=10;


        }
        if(num==temp){
            System.out.println("an armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrong(n);

    }
}
