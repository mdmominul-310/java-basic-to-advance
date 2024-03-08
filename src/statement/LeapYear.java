package statement;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//  A year is leap, if it is divisible by 4 and 400. But, not by 100.
//        int year=2015;
//        if(year%4==0){
//            if(year%100!=0){
//                System.out.print("The year is leap year");
//            } else if (year%400==0) {
//                System.out.print("The year is leap year");
//            }
//        }else {
//            System.out.print("The year is not leap year!");
//        }
        // create a scanner object
    Scanner input =new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year=input.nextInt();
    if((year%4==0)&&(year%100!=0)|| (year%400==0)){
        System.out.print("The year is leap year");
    }else {
        System.out.print("The  year is not leap year!");
    }

    }
}
