package maths;

import java.util.Scanner;

public class bonus_calc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int salary=in.nextInt();
        int bonus;
        if(salary>50000){
            bonus=(salary*20)/100;
        }
        else if (salary>30000 && salary<50000) {
            bonus=(salary*10)/100;
        }
        else{
            bonus=(salary*5)/100;
        }
        System.out.println(bonus);


    }
}
