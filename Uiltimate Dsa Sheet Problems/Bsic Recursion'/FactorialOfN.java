public class FactorialOfN {
    static void factorial(int i,int fact){
        if(i < 1){
            System.out.println(fact);
            return;
        }

        factorial(i-1, fact*=i);
    }
    public static void main(String args[]){
        factorial(5,1);
    }
}
