package loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
//        4! = 4*3*2*1 = 24
//        5! = 5*4*3*2*1 = 120
//        3!=3*2*1
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number=input.nextInt();
        int fact =1;

        if(number==0){
            fact=0;
        }else{
            for(int i=1;i<=number;i++){
                fact =fact*i;
            }
        }

        System.out.println("The fact is: "+fact);


    }
}
