import java.util.Scanner;
public class FactUSingFun {
    public static int Factorial(int n){
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr a number for n : ");
        int n=sc.nextInt();
        int FactoOfn=Factorial(n);
        System.out.println("Factorial of n = "+FactoOfn);
    }
    
}
