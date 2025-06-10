import java.util.Scanner;
public class Palindrome {
    public static void Palind(int n){
        int rev=n;
        int rem=0;
        for(int i=n ; i>0 ; i/=10){
            int lastDigit=i%10;
            rem=rem*10+lastDigit;
        }
        rev=rem;
        if(n==rev){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palind(n);
    }
    
}
