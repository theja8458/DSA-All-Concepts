public class SolidRhombus {
    public static void Solidrhombuspattrn(int n){
        for(int i=1 ; i<=n ; i++){
            for(int sp=1 ; sp<=n-i ; sp++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     public static void main(String args[]){
        Solidrhombuspattrn(5);
     }
    
}
