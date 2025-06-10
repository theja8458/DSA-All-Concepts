public class TimesArrayRotate {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        int low=0 , high = n-1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid+1;
            }else{
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[low];
                }
                high = mid-1;
            }
        }
        System.out.println(index);
    }
}
