public class FactofN {
    
    public static int factofn(int n){
        if(n==0){
            return 1;
        }
        // int fm1=factofn(n-1);
        int fn=n*factofn(n-1);
        return fn;
    }
    public static void main(String args[]){
       int n=5;
       System.out.println(factofn(n));
    }
    
}
