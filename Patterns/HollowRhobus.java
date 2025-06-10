public class HollowRhobus {
    public static void HollowRhombus(int n){
        for(int i=1 ; i<=n; i++){
            for(int sp=1 ; sp<=n-i ; sp++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=n; j++){
            if(i==1||i==n || j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        HollowRhombus(5);
    }
    
}
