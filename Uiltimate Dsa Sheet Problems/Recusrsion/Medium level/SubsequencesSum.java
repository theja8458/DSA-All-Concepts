import java.util.*;
public class SubsequencesSum {
   static void subseqSumK(int i , int arr[] , List<Integer> list,int sum,int k){
    if(i == arr.length){
        if(sum == k)
            System.err.println(list);
        return;
    }

    list.add(arr[i]);
    sum += arr[i];
    subseqSumK(i+1, arr, list, sum, k);
    list.remove(list.size()-1);
    sum -= arr[i];

    subseqSumK(i+1, arr, list, sum, k);
   }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        List<Integer> ans = new ArrayList<>();
        subseqSumK(0, arr, ans, 0, 2);

    }
}
