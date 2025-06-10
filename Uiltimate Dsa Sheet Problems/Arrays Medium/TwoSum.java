import java.util.*;
class TwoSum{
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int res[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int curSum = arr[i];
            int remainSum = target - curSum;
            if(hm.containsKey(remainSum)){
               res[0] = i;
               res[1] = hm.get(remainSum);
               break;
            }
            hm.put(curSum, i);

        }
        System.out.println("["+res[0]+","+res[1]+"]");

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                res[0] = left;
                res[1] = right;
                break;
            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}