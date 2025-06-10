import java.util.Scanner;
public class PosORNeg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your value :");
        int value=sc.nextInt();
        if(value<0){
            System.out.println("value is negetive");
        }
        else{
            System.out.println("Value is positive");
        }
        sc.close();
    }
    
}
