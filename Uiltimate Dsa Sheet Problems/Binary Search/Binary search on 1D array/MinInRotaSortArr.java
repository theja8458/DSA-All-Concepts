public class MinInRotaSortArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[high]){
                ans = Math.min(arr[low] , ans);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans , arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans , arr[mid]);
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
