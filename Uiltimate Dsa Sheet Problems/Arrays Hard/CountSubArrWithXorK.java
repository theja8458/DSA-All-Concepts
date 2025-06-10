import java.util.*;
public class CountSubArrWithXorK {
    public static void main(String[] args) {

        int arr[] = {4,2,2,6,4};
        int n = arr.length;
        int count = 0;
        int k = 6;
        for(int i=0 ; i<n ; i++){
            int xor = 0;
            for(int j=i ; j<n ; j++){
                xor = xor^arr[j];
                if(xor == k) count++;
            }
        }
        System.out.println(count);

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int xor = 0;
        count = 0;
        for(int i=0 ; i<n ; i++){
            xor = xor^arr[i];
            int x = xor^k;
            if(hm.containsKey(x)){
                count += hm.get(x);
            }
            hm.put(xor , hm.getOrDefault(xor,0)+1);
        } 
        System.out.println(count);
    }
}
