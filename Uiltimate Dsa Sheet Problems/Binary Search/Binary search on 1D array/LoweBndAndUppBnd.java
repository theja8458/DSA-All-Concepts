public class LoweBndAndUppBnd {
    public static void main(String[] args) {
        // it is also work for search insert position problem
        int arr[] = {1,2,3,3,7,8,9,9,9,11};
        int n = arr.length;
        int ans = n;
        int low = 0 , hihgh = n-1;
        int x = 1;
        while (low <= hihgh) {
            int mid = (low+hihgh)/2;
            if(arr[mid] >= x){
                ans = mid;
                hihgh = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
        
        //upper bound 
        int arr2[] = {2,6,7,8,8,11,11,11,12};
        n = arr2.length;
        low = 0 ; hihgh = n-1;
        ans = n;
        x=11;
        while (low <= hihgh) {
            int mid = (low + hihgh)/2;
            if(arr[mid] > x){
                ans = mid;
                hihgh = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);

    }
}
