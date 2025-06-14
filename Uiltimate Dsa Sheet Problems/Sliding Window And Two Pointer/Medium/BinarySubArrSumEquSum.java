public class BinarySubArrSumEquSum {
    public static int fun(int nums[],int goal){
      if(goal < 0) return 0;
      int l = 0 , r= 0 , cnt= 0 , sum = 0;
      while (r < nums.length) {
        sum += nums[r];
        while (sum > goal) {
            sum -= nums[l];
            l++;
        }
        if(sum <= goal){
            cnt += r-l+1;
        }
        r++;
      }
      return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1};
        int goal  = 2;
        int lesser = fun(arr,goal);
        int equal = fun(arr,goal-1);
        System.out.println("Binary subarray sum equal to goal  = "+(lesser-equal));
    }
}
