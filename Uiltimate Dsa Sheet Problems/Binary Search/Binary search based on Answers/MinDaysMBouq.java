public class MinDaysMBouq {
    static boolean isPossible(int arr[],int day,int m,int k){
        int count = 0;
        int noOfBqs = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] <= day){
                count++;
            }else{
                noOfBqs +=(count/k);
                count = 0;
            }
        }
        noOfBqs += (count/k);
        if(noOfBqs >= m) return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7,7,7,7,13,11,12,7};
        int n = arr.length;
        int m = 2 , k = 3;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            min = Math.min(arr[i] , min);
            max = Math.max(arr[i] , max);
        }
        //  int ans = Integer.MAX_VALUE;
        // for(int i=min ; i<=max ; i++){
        //     if(isPossible(arr,i,m,k)){
        //         // ans = Math.min(i , ans);
        //         System.out.println(i);
        //         return;
        //     }
        // }
        // System.out.println(-1);
        // int ans = 0;
        int low  = min;
        int high = max;
        while (low <= high) {
            int mid = (low+high)/2;
            if(isPossible(arr, mid, m, k)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(low);

    }
}
