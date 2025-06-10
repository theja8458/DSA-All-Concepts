class CapToShipPackgWithinDdays{
    static int fun(int arr[],int cap){
        int days = 1 , load=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]+load > cap){
                load = arr[i];
                days = days+1;
            }else{
                load += arr[i];
            }
        }
        return days;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int max = 0;
        int sum = 0;
        int n = arr.length;
        int days = 5;
        for(int i=0 ; i<n ; i++){
            max = Math.max(arr[i],max);
            sum += arr[i];
        }
        // for(int cap=max ; cap<=sum ; cap++){
        //     int ReqDays = fun(arr,cap);
        //     if(ReqDays <= days){
        //         System.out.println(cap);
        //         return;
        //     }
        // }
        int ans = 0;
        int low = max , high = sum;
        while (low <= high) {
            int mid = (low+high)/2;
            if(fun(arr, mid) <= days){
                ans = fun(arr, mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}