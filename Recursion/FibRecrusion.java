public class FibRecrusion {

     public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }

        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int fibn=fib1+fib2;

        return fibn;
     }
    public static void main(String args[]){
        int n=7;
        System.out.println(fib(n));
    }
    
}
