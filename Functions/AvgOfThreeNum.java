import java.util.Scanner;
public class AvgOfThreeNum {
    public static double Avg(double a,double b,double c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Eneter the first number");
       double a=sc.nextDouble();
       System.out.println("Enetr second number");
       double b=sc.nextDouble();
       System.out.println("Enetr the third number:");
       double c=sc.nextDouble();
       System.out.println("Avaerage of three numbers = "+Avg(a, b, c));
    }
}
