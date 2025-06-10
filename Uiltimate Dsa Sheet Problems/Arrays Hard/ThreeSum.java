import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        // for(int i=0 ; i<n ; i++){
        //     for(int j=i+1 ; j<n ; j++){
        //         for(int k=j+1 ; k<n ; k++){
        //             if(arr[i]+arr[j]+arr[k] == 0){
        //                 int temp[] = {arr[i],arr[j],arr[k]};
        //                 Arrays.sort(temp);
        //                 set.add(Arrays.asList(temp[0],temp[1],temp[2]));
        //                 // list.add(Arrays.asList(temp));
        //             }
        //         }
        //     }
        // }
        List<List<Integer>> list = new ArrayList<>(); 
        // System.out.println(list);
        
        //better
    //    set = new HashSet<>();
    //     HashSet<Integer>  hs = new HashSet<>();
    //     for(int i=0 ; i<n ; i++){
    //         hs = new HashSet<>();
    //         for(int j=i+1 ; j<n ; j++){
    //             int k = -(arr[i]+arr[j]);
    //             hs.add(arr[j]);
    //             if(hs.contains(k)){
    //                 int temp[] = {arr[i],arr[j] , k};
    //                 Arrays.sort(temp);
    //                 set.add(Arrays.asList(temp[0],temp[1],temp[2]));
    //         }
    //         // hs = new HashSet<>();
    //     }
    // }
    // System.out.println(set);

    //optimal;
   Arrays.sort(arr);
    for(int i=0 ; i<n ; i++){
        if(i > 0 && arr[i] == arr[i-1]) continue;
        int j = i+1;
        int k = n-1;
        while(j < k){
        int sum = arr[i] + arr[j] + arr[k];
        if(sum < 0){
            j++;
        }else if(sum > 0){
            k--;
        }else{
            list.add(Arrays.asList(arr[i],arr[j],arr[k]));
            j++;
            k--;

            while (j < k && arr[j] == arr[j-1]) {
                j++;
            }
            while (j < k && arr[k] == arr[k+1]) {
                k--;
            }
        }
    }
    }
    System.out.println(list);

    
}
}
