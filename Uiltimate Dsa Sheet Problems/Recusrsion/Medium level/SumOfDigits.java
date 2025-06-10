public class SumOfDigits {
    static int sum(int n,int sum){
        if(n == 0) return sum;

        sum+= (n%10);
        return sum(n/10, sum);
        
    }
    public static void main(String[] args) {
        System.out.println(sum(12, 0));
    }
}
