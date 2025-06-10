import java.util.Scanner;
class Airthmatic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Division = "+ (a/b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Modulo Div = "+(a%b));
    }

}