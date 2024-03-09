package statement;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args){
/*
* 80-100 ->A+
* 70-79 ->A
* 60-69-> A-
* 50-59->B
* 40-49->c
* less than 40 fail
* */
        // create a scanner object
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number=input.nextInt();

//        if(number>80){
//            System.out.print("A+");
//        } else if (number>70) {
//            System.out.print("A");
//
//        }else if(number>60){
//            System.out.print("A-");
//
//        } else if(number>50){
//            System.out.print("B");
//
//        }else if(number>40){
//            System.out.print("c");
//
//        }else {
//            System.out.print("F");
//        }
        switch (number/10){
            case 10:
                System.out.print("A+");
                break;
            case 9:
                System.out.print("A+");
                break;
            case 8:
                System.out.print("+");
                break;
            case 7:
                System.out.print("A");
                break;
            case 6:
                System.out.print("A-");
                break;
            case 5:
                System.out.print("B");
                break;
            default:
                System.out.print("F");
                break;
        }


    }
}
