import java.util.*;
class CombinationTwo {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    static void backtrack(int ind,int arr[],int t,List<Integer> path, List<List<Integer>> ans){
            if(t == 0){
                ans.add(new ArrayList<>(path));
                return;
            }
        for(int i=ind ; i<arr.length ; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > t) break;
            path.add(arr[i]);
            backtrack(i+1,arr,t-arr[i],path,ans);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(arr,target));
    }
}