import java.util.*;
public class FruitsIntoBask {
  public static void main(String[] args) {
    int arr[] = {3,3,3,1,2,1,1,2,3,3,4};
    int maxLen = 0;
    int n = arr.length;

    //Brute Force Approach
    // for(int i=0 ; i<n ; i++){
    //     Set<Integer> set = new HashSet<>();
    //     for(int j=i ; j<n ;j++){
    //         set.add(arr[j]);
    //         if(set.size() <= 2){
    //             maxLen = Math.max(maxLen , j-i+1);
    //         }else{
    //             break;
    //         }
    //     } 
    // }
    // System.out.println(maxLen);

    int l = 0, r = 0;
    int k = 2;
    HashMap<Integer,Integer> hm = new HashMap<>();
    while (r < n) {
        hm.put(arr[r], hm.getOrDefault(arr[r], 0)+1);
        if(hm.size() > k){
            hm.put(arr[l], hm.get(arr[l])-1);
            if(hm.get(arr[l]) == 0) hm.remove(arr[l]);
            l++;
        }
        if(hm.size() <= k){
            maxLen = Math.max(maxLen, r-l+1);
        }
        r++;
    }
    System.out.println(maxLen);
  }   
}
