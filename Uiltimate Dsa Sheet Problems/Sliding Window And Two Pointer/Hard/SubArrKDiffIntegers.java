import java.util.*;;
public class SubArrKDiffIntegers {

    public static int fun(int arr[],int k){
        int l= 0 , r = 0, cnt = 0;
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while (r < n) {
            hm.put(arr[r], hm.getOrDefault(arr[r], 0)+1);
            while (hm.size() > k) {
                hm.put(arr[l], hm.get(arr[l])-1);
                if(hm.get(arr[l]) == 0) hm.remove(arr[l]);
                l++;
            }
            cnt = cnt +(r-l+1);
            r++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,1,3,4,3,2};
        int k = 3;
        int ans = fun(arr,k) - fun(arr,k-1);
        System.out.println(ans);
    }
}
