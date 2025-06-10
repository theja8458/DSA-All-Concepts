import java.util.*;
class Subsequences{

    static void subseq(int i,int arr[],List<Integer> list){
        if(i == arr.length){
          System.out.println(list);
          return;
        }

        list.add(arr[i]);
        subseq(i+1, arr, list);
        list.remove(list.size()-1);


        subseq(i+1, arr, list);
    }
    public static void main(String args[]){
        int arr[] = {3,1,2};
        List<Integer> ans = new ArrayList<>();
        subseq(0, arr, ans);
        // we can also do reverse order 
    }
}