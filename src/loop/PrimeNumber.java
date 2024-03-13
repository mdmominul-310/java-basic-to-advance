package loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
      // create a scanner object
        Scanner input =new Scanner(System.in);
        // get input from the user
        System.out.print("Enter a number: ");
        int number=input.nextInt();

       boolean isPrime=true;
       int m=number/2;

       if(number<2){
           isPrime=false;
       }
       for(int i=2;i<=m;i++){
           if(number%i==0)  {
               isPrime=false;
               break;
           }
       }

       if(isPrime)   {
           System.out.print("The given number is prime number");
       }     else {
           System.out.print("The given number is not a prime number");
       }

    }
}
