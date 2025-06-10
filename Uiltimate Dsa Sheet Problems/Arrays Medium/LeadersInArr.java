import java.util.*;
public class LeadersInArr {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0 ; i <n ; i++){
            boolean leader = true;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true) ans.add(arr[i]);
        }
        System.out.println(ans);
        ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1 ; i>=0 ; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
            }
            max = Math.max(arr[i],max);
        }
        System.out.println(ans);
    }
}
