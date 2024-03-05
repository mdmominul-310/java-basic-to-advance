package Operators;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args){
        // create a scanner object
        Scanner input=new Scanner(System.in);
        double radius;
        System.out.print("Enter circle radius: ");
        radius=input.nextInt();
        double PI=3.14159;
        double area=radius*radius*PI;
        System.out.println("The area of circle is: "+area);
    }
}
