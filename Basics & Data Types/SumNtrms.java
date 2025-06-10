public class SumNtrms {
    public static void main(String args[]){
        int n=5;
        int sum=0;
        for(int i=1 ; i<=n ;i++){
            int pow=(int)Math.pow(i, 3);
            sum+=pow;
        }
        System.out.print(sum);
    }
}
