public class CntNumOfNiceSubArrs {

    static int fun(int arr[],int k){
         if(k < 0) return 0;
         int l = 0 , r = 0 , cnt = 0 , sum = 0;
         int n = arr.length;
         while (r < n) {
             sum +=arr[r]%2;
             while (sum > k) {
                sum -= arr[l]%2;
                l++;
             }
             cnt += r-l+1;
             r++;
         }
         return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int lesser = fun(arr,k);
        int equal = fun(arr,k-1);
        System.out.println("Nice Subarrays : "+(lesser - equal));
    }
}
