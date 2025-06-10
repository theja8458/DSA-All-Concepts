import java.util.*;
public class MinAbsDifPair {

    public static void main(String args[]){
        int A[]={1,7,5};
        int B[]={2,3,5};
       Arrays.sort(A);
       Arrays.sort(B);
        // int j=0;
        int ans=0;
        for(int i=0 ; i<A.length ; i++){
          ans+=Math.abs(A[i]-B[i]);
        }
        System.out.println(ans);
    }
    
}
