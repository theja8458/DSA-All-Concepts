import java.util.*;
class TwoSum{

    public static int[] twosum(int arr[],int target,int res[]){

        HashMap<Integer , Integer> hm = new HashMap<>();
        // int res[] = new int[2];
        for(int i=0 ; i<arr.length ; i++){
            int cursum = arr[i];
            int remainsum = target - cursum;
            if(hm.containsKey(remainsum)){
                res[0] = hm.get(remainsum);
                res[1] = i;
                return res;
            }
            hm.put(cursum, i);
        }

        return res;
    }
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 17;
        int res[] = new int[2];
        twosum(arr, target,res);
        System.out.println(res[0]+" " +res[1]);
    }
}