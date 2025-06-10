import java.util.*;
public class MajorityElem {
    public static void main(String args[]){
        // int arr[]={1,3,2,5,1,3,1,5,1};
        int arr[]={3,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n=arr.length;
        // int times = n/3;
        for(int i=0 ; i<n ; i++){
            // if(!hm.containsKey(arr[i])){
            //     hm.put(arr[i], 1);
            // }else{
            //     hm.put(arr[i],hm.get(arr[i])+1);
            // }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : hm.keySet()) {
            if(hm.get(i) > n/3){
              list.add(i);
            }
        }

        System.out.println(list);
    }
    
}
