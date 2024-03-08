package statement;

public class EvenOdd {
    public static void main(String[] args){
        int number=7;

//        if(number>0){
//            if(number<20){
//                System.out.print("The number is grater than 0 and less then 20");
//            }
//            else{
//                System.out.print("The number is grater than 0 ");
//
//            }
//        }
//        else {
//            System.out.print("The number is less than 0 ");
//
//        }

        if(number%2==0){
            System.out.print("The number is Even");
        }else{
            System.out.print("The number is odd");
        }
    }
}
