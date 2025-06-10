public class XPowerN {
 
  public static int pow(int x,int n){
    if(n==0){
        return 1;
    }
    // int xnm1= pow(x,n-1);
    // int xn=x*xnm1;
    // return xn;
    return x*pow(x,n-1);
  }

    public static void main(String args[]){
   int n=10;
   int x=2;
   System.out.println(pow(x, n));
    }
    
}
