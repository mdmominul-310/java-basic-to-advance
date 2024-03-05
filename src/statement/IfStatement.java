package statement;
import  java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        // create a scanner object
        Scanner input=new Scanner(System.in);
        //get a char from user
        System.out.print("Enter a num: ");
        int num=input.nextInt();

        if(num>0){
            System.out.print("The number is grater than o");
        }else {
            System.out.print("The number is not grater than o");

        }

//        if(a=='a'){
//            System.out.print("the char is vowel");
//        }
//        if(a=='e'){
//            System.out.print("the char is vowel");
//        }
//        if(a=='i'){
//            System.out.print("the char is vowel");
//        }
//        if(a=='o'){
//            System.out.print("the char is vowel");
//        }
//        if(a=='u'){
//            System.out.print("the char is vowel");
//        }




    }
}
