import java.util.Scanner;
public class Even {
    public static boolean Even(int n){
        if (n%2==0){
        return true;
        }
        else{
        return false;
        }
        
        
        
    }
    
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Even(n));

    }
    
    
}
