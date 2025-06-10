public class SumOfFisrtNnumb {
    // static int sum = 0;
    static void fun(int i,int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
         fun(i-1, sum+=i);
    }
    static int funSumofN(int n){
        if(n == 1){
            return 1;
        }
        return n*funSumofN(n-1);
    }
    public static void main(String[] args) {
        // int n = 3;
        int sum = 0;
        fun(5,sum);
        System.out.println(funSumofN(5));
    }
}
