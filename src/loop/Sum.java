package loop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        // write a program that takes and integer from user and print sum of 0 to given number!
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number=input.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++){
//            sum+=i;
            sum=sum+i;
        }

        System.out.print("The sum is: "+sum);


    }
}
