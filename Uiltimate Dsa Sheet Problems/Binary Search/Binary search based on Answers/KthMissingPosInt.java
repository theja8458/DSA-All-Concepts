public class KthMissingPosInt {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int n = arr.length;
        int k=5;
        // for(int i=0 ; i<n ; i++){
        //     if(arr[i] <= k){
        //         k++;
        //     }else{
        //            break;
        //     }
        // }
        // System.out.println(k);

        int low = 0 , high = n-1;
        while (low <= high) {
            int mid = (low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        //low+k;
        System.out.println(high+k+1);    
    }
}
