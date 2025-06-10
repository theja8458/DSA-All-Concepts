public class DiamondPattrn {

    public static void DiamondPattern(int n){
        for(int i=1 ; i<=n ; i++){
            for(int sp=1  ;sp<=n-i ; sp++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n ; i>=1 ; i--){
            for(int sp=1  ;sp<=n-i ; sp++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        DiamondPattern(4);

    }
    
}
