public class FirstAndLastOccur {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,8,8,11,13};
        int n = arr.length;
        int fist=-1 , last = -1;
        int x=14;
        for(int i=0 ; i<n ; i++){
         if(arr[i] == x){
            if(fist == -1){
            fist=i;
            }
            last = i;
         }
         
        }
        System.out.println(fist+" "+last);

        int first = -1 ;
        last = -1;
        int ans = n;
        int low = 0 , hihgh = n-1;
        // int x = 1;
        while (low <= hihgh) {
            int mid = (low+hihgh)/2;
            if(arr[mid] >= x){
                ans = mid;
                hihgh = mid-1;
            }else{
                low = mid+1;
            }
        }

        if(ans == n || arr[ans]!=x){
            ans = -1;
        }
       int ans2=n;
       low=0 ; hihgh = n-1;
        while (low <= hihgh) {
            int mid = (low + hihgh)/2;
            if(arr[mid] > x){
                ans2 = mid;
                hihgh = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans == n || arr[ans] != x){
            System.out.println(-1+" "+(-1));
            return;
        }
        System.err.println(ans+" "+(ans2-1));
    }
}
