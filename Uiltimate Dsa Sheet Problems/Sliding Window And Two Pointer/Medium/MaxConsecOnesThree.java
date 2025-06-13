public class MaxConsecOnesThree {
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int n = nums.length;
        int len = 0;
        int maxlen = 0;
        int k = 2;

        //Brute Force Approach
        // for(int i=0 ; i<n ; i++){
        //     int zeros = 0;
        //     for(int j=i ; j<n ; j++){
        //         if(nums[j] == 0) zeros++;
        //         if(zeros <= k){
        //             len = j-i+1;
        //             maxlen = Math.max(maxlen, len);
        //         }else break;
        //     }
        // }
        // System.out.println(maxlen);

        //Optimal Approach

        int l = 0 , r = 0 ;
        int zeros = 0;
        while (r < n) {
            if(nums[r] == 0){
              zeros++;
            }
           while (zeros > k) {
               if(nums[l] == 0) zeros--;
               l++;
           }
           if(zeros <= k){
            len = r-l+1;
            maxlen = Math.max(maxlen, len);
           }
           r++;
        }
        System.out.println(maxlen);

        //for Optimal approach
        //  if(zeros > k){
        //     if(nums[l] == 0) zeros--;
        //     l++;
        //  }
    }
}
