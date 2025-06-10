import java.util.*;
public class MergeOvelapInterv {
    public static void main(String[] args) {
        int arr[][] ={{1,3} , {2,6} , {8,10} , {15,18} };
         Arrays.sort(arr , Comparator.comparing(a->a[0]));
         int n = arr.length;
         List<int[]> ans = new ArrayList<>();
         for(int i=0 ; i<n ; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]){
                continue;
            }

            for(int j=i+1 ; j<n ; j++){
                if(arr[j][0] <= end){
                    end = Math.max(end , arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(new int[]{start , end});
         }

         for(int i=0 ; i<ans.size () ; i++){
            System.out.println(ans.get(i)[0]+" "+ans.get(i)[1]);
         }
    }
}
