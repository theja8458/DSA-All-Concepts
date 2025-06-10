import java.util.*;
public class LargeSubArrWithSumZero {
    public static void main(String[] args) {
        int arr[] = {1,0,-4,3,1,0};
        int n = arr.length;
        int LongSubArr = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int start = i;
            for(int j=i ; j<n ; j++){
                int sum = 0;
                int end = j;
                for(int k=start ; k<=end ; k++){
                    sum += arr[k];
                }
                if(sum == 0){
                    LongSubArr = Math.max(LongSubArr , start+end-start);
                }
            }
        }
        System.out.println(LongSubArr);
        HashMap<Integer,Integer> hm= new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            if(sum == 0){
                maxi = i+1;
            }else if(hm.get(sum) != null){
              maxi = Math.max(maxi , i-hm.get(sum));
            }else{
                hm.put(sum , i);
            }
        }
        System.out.println(maxi);
    }
}
