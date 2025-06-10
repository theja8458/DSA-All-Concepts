public class FndsPairProb {

   public static int pair(int n){
      if(n==1 || n==2){
        return n;
      }

    //choice
    // int fnm1=pair(n-1);
    // int fnm2=pair(n-2);
    // int pairways=n-1 * fnm2;
    // int totways=fnm1 + pairways;

    // return totways;
    return pair(n-1)+(n-1)*pair(n-2);
   }      
    public static void main(String args[]){
   System.out.println(pair(3));
    
}

}