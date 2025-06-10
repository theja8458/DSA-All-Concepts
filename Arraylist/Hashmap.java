import java.util.*;
public class Hashmap {

    public static void main(String args[]){
        HashMap<Integer, Integer> mp=new HashMap<>();
        // mp.put(7, 10);
        // mp.put(3, 5);
        // mp.put(9,11);
        // // System.out.println("5 : " +mp.containsKey(5));
        // // System.out.println("10 : "+mp.containsKey(10));
        // // System.out.println("9 : "+mp.containsKey(9));

        // // System.out.println(mp.size());
        // System.out.println(mp.get(7));
        // System.out.println(mp.get(9));

        int arr[]={7,1,3,7,9,9,7};
        for(int i=0 ; i<arr.length ; i++){
            if(mp.containsKey(arr[i]) == false){
                mp.put(arr[i], 1);
            }else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }
        System.out.println(mp.get(7));
    }
    
}
