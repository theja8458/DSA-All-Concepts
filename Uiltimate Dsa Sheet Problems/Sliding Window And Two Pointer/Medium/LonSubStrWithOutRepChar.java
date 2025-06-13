import java.lang.reflect.Array;
import java.util.*;
class LonSubStrWithOutRepChar{
    public static void main(String[] args) {
        String s = "pwwkew";


        //Brute force....
        // int maxLen = 0;
        // int n = s.length();
        // int len = 0;
        // for(int i=0 ; i<n ; i++){
        //     int hash[] = new int[256];
        //     for(int j=i ; j<n ; j++){
        //         if(hash[s.charAt(j)] == 1) break;
        //         len = j-i+1;
        //         maxLen = Math.max(maxLen, len);
        //         hash[s.charAt(j)]++;
        //     }
        // }
        // System.out.println(maxLen);

        //optimal approach
        int l = 0 , r = 0;
        int maxLen = 0 , len = 0;
        int hashArr[] = new int[256];
        Arrays.fill(hashArr, -1);
        int n = s.length();
        while (r < n) {
            char ch = s.charAt(r);
            if(hashArr[ch] != -1 && hashArr[ch] > 1){
                l = Math.max(l, hashArr[ch] + 1);
            }
          hashArr[ch]=r;
          len = r-l+1;
          maxLen = Math.max(maxLen, len);
        
          r++;
        }
        System.out.println(maxLen);
    }
}