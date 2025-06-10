public class XpowNWithLogn {

  public static int optmizepow(int a, int n){

    if(n == 0){
        return 1;
    }
    int halfpow=optmizepow(a, n/2);
    int halpowesq=halfpow * halfpow;

    if(n % 2 !=0){
        halpowesq=a*halpowesq;
    }

    return halpowesq;
  }

    public static void main(String args[]){
        int  a=2;
        int n=5;
        System.out.println(optmizepow(a, n));
    }
    
}
