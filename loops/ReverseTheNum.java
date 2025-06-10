import java.util.*;
public class ReverseTheNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverseNum=0;
        for(int i=num ; i>0 ; i/=10){
           int lastDigit=i%10;
            reverseNum=reverseNum*10+lastDigit;
        }
        System.out.println(reverseNum);
    }
    
}
