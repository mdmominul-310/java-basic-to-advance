package method;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        /*
        15,35
        15=1*3*5
        35=1*7*5
        * */

        //create a scanner
        Scanner input =new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1=input.nextInt();
        System.out.print("Enter second integer: ");
        int n2=input.nextInt();


        gcd(n1,n2);

    }

    public static void gcd(int n1,int n2){
        int gcd=1;
        int k=2;

        while (k<=n1&&k<=n2){
            if(n1%k==0 &&n2%k==0){
                gcd=k;
            }
            k++;

        }

        System.out.println("The greatest common divisor for "+n1+" and "+n2+ " is "+gcd);
    }
}
