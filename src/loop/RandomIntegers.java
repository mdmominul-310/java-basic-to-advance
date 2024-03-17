package loop;

public class RandomIntegers {
    public static void main(String[] args){
/*
*  Write a program which will use while loop to print all the integers between 100 and 150
which are divisible by 8 in descending order.
Output: 144 136 128 120 112 104
* */



//int i=150;
//while(i>=100){
// if (i%8==0){
//     System.out.print(i+" ");
// }
//    i--;
//}
        int min=1990;
        int max=2020;
        int randomNumber=(int)(min+Math.random()*(max-min));
        System.out.print(randomNumber);





    }






    /*
 Generate a random int between 1990 and 2020. Then print it check if it’s a leap year or
not. Note: A leap year must satisfy any or both of the following conditions:
Divisible by 400
Divisible by 4 and not divisible by 100
Sample output:
2015: false
2015: false
     */
}
