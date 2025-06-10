import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a value :");
        int a=sc.nextInt();
        System.out.println("Enetr b value");
        int b=sc.nextInt();
        System.out.println("Enetr opertor :");
                char ope=sc.next().charAt(0);
                switch(ope){
                    case '+': System.out.println("Addition = "+(a+b));
                    break;
                    case '-': System.out.println("Subtraction = "+(a-b));
                    break;
                    case '*':System.out.println("Multiplication = "+(a*b));
                    break;
                    case '/':System.out.println("Division = "+(a/b));
                    break;
                    case '%':System.out.println("Modulo Division = "+(a%b));
                    break;
                    default:System.out.println("You enter wrong character");
            }
            sc.close();
    }
    
}
