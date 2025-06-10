public class InverAndRotHalPyr{
    public static void InverRotHalPy(int n){
        for(int i=1 ; i<=n ; i++){
            for(int sp=1; sp<=n-i ;sp++){  //for(int sp=n-i ; sp>=1 ; sp--)
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        InverRotHalPy(4);
    }
}