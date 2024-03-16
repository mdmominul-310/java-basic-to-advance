package loop;

import java.util.Scanner;

public class Divisors {
   public static void main(String[] args){
      // Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.
       Scanner input=new Scanner(System.in);
       System.out.print("Enter an integer number: ");
       int number=input.nextInt();

       for(int i=1;i<=number/2;i++){
           if(number%i==0){
               System.out.print(i+" ");
           }
       }
   }
}
