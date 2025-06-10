import java.util.*;
public class AggresiveCows {
    static boolean canWePlace(int arr[],int dis,int cows){
        int countcows = 1 , last=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] - last >= dis){
                countcows++;
                last = arr[i];
            }
        }
        if(countcows >= cows) return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9};
        int n = arr.length;
        int cows = 4;
        Arrays.sort(arr);
        // for(int i=1 ; i<=arr[n-1]-arr[0] ; i++){
        //     if(canWePlace(arr,i,cows)){
        //         continue;
        //     }else{
        //         System.out.println(i-1);
        //         return;
        //     }
        // }
        int low = 1 , high = arr[n-1]-arr[0];
        while (low <= high) {
            int mid = (low+high)/2;
            if(canWePlace(arr, mid, cows)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(high);
    }
}
