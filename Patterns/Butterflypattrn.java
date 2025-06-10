public class Butterflypattrn {
    public static void Butterfly(int n){
       // int space=n+2;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int sp=1 ; sp<=2*(n-i); sp++){  //for(int sp=1 ; sp<=space; sp++)
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //space-=2;
            System.out.println();
        }
       
        // int space2=0;
        for(int i=n ; i>=1 ; i--){
            
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
           for(int sp=1 ; sp<=2*(n-i); sp++){ //for(int sp=1 ; sp<=space2; sp++){
            
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // space2+=2;
            System.out.println();
        }
    }

    public static void main(String args[]){
        Butterfly(4);
    }
    
}
