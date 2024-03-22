package method;

public class SumInt {
    public static void main(String[] args){
        int sum1=sum(1,10);
        int sum2=sum(10,20);
        int sum3=sum(35,45);

        System.out.println("Sum 1 : "+sum1);
        System.out.println("Sum 2 : "+sum2);
        System.out.println("Sum 3 : "+sum3);

    }

    public static int sum(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        return sum;
    }



}
