public class SunOfDigits {
    public static int SumDigitd(int n){
        int sum=0;
        for(int i=n ; i>0 ; i/=10){
            int lastDigit=i%10;
            sum+=lastDigit;
        }
       
        return sum;
    }
    public static void main(String args[]){
        System.out.println(SumDigitd(121));
    }
    
}
