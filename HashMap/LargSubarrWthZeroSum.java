import java.util.*;
public class LargSubarrWthZeroSum {
    
    public static void main(String args[]){
        int arr[]={-31 ,-48 ,-90 ,54 ,20 ,95 ,6 ,-86 ,22};

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        int len=0;

        for(int j=0 ; j<arr.length ; j++){
            sum+=arr[j];
            if(hm.containsKey(sum)){
                len=Math.max(len, j-hm.get(sum));
            }else{
             hm.put(sum, j);
            }
        }

        System.out.println(len);
    }
}
