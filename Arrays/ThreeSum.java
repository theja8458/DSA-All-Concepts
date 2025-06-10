import java.util.*;
public class ThreeSum {
    public static void main(String args[]){
        // ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<List<Integer>> list=new ArrayList<>();
        // Set<List<Integer>> set= new HashSet<>();
        int arr[]={-1,0,1,2,-1,-4};
    //    for(int i=0 ; i<arr.length ; i++){
    //     for(int j=i+1 ; j<arr.length ; j++){
    //         for(int k=j+1 ; k<arr.length ; k++){
    //             if(arr[i] + arr[j] + arr[k] == 0){
    //                 List<Integer> trip=Arrays.asList(arr[i] , arr[j] , arr[k]);
    //                 Collections.sort(trip);
    //                 if(!set.contains(trip)){
    //                     set.add(trip);
    //                     list.add(trip);
    //                 }
    //             }
    //         }
    //     }
    //    }
    Arrays.sort(arr);
  int n=arr.length;
    for(int i=0 ; i<n ; i++){
        if(i > 0 && arr[i] == arr[i-1]){
            continue;
        }
        int j=i+1;
        int k=n-1;
        while(j < k){
            int sum=arr[i]+arr[j]+arr[k];
            if(sum > 0){
                k--;
            }else if(sum < 0){
                j++;
            }else{
                List<Integer> triple=Arrays.asList(arr[i],arr[j],arr[k]);
                list.add(triple);
                j++;
                k--;

                while(j < k && arr[j]==arr[j-1]){
                    j++;
                }
            }
        }
    }
       System.out.println(list);
    }
}
