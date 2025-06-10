public class HollowPatr {

    public static void HollowRec(int totrows, int totCol){
      
        for(int i=1 ; i<=totrows ; i++){
            for(int j=1 ; j<=totCol ; j++){
                //cell (i,j)
                if(i==1 || i==totrows || j==1 || j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        HollowRec(4, 5);

    }
    
}
