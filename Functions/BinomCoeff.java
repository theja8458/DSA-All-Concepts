import java.util.Scanner;
public class BinomCoeff {
    public static int factorial(int n){
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact*=i;
        }
        
        return fact;
    }
    public static int binCoffi(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int factnmr=factorial(n-r);
        int binCoeff=fact_n/(fact_r*factnmr);
        return binCoeff;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(binCoffi(5, 2));
    }
    
}
