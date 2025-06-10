public class BinaToDec {
    public static void bintoDec(int n){
     int pow=0;
     int dec=0;
     int binum=n;
     while(n>0){
        int lastDigit=n%10;
        dec=dec+(lastDigit* (int)Math.pow (2 , pow));
        pow++;
        n/=10;
     }
     System.out.println("Decimal of "+binum+" = "+dec);
    }
    public static void main(String args[]){
        bintoDec(1010);
    }
    
}
