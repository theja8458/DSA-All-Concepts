import java.util.*;
public class ContainsDuplicate {
    
    public static boolean solve(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 0);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        System.out.println(solve(arr));
    }
    
}
