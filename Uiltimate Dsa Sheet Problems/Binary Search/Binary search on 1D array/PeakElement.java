class PeakElement{
    public static void main(String[] args) {
        int arr[] = {1,2,1,5,1};
        int n = arr.length;
        // for(int i=0 ; i<n ; i++){
        //     if(i == 0 || arr[i-1] < arr[i] && i==n-1 || arr[i] > arr[i+1]){
        //         System.out.println(arr[i]);
        //         return;
        //     }
        // }
        if(arr[0] > arr[1]) {
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1] > arr[n-2]){
          System.out.println(arr[n-1]);
          return;
        }
        //single peak
        int low = 1 , high = n-2;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            }
            if(arr[mid-1] < arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}