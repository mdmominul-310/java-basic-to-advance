package method;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
//        Write a method countVowels(String arg) that takes a String as parameter and returns
//        the number of vowels
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=input.nextLine();
        int result=countVowels(word);
        System.out.println("Total vowels number is: "+result);


    }


    public static int countVowels(String word){
        int count=0;
            for(int i=0;i<word.length();i++){
                switch (word.charAt(i)){
                    case 'a','e','i','o','u':
                        count++;
                        break;
                }
    }
        return count;
    }


}
