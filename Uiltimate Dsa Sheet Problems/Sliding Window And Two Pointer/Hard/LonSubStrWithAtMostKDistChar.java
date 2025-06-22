import java.util.*;
class LonSubStrWithAtMostKDistChar{
    public static void main(String[] args) {
        String s = "aaabbccdd";
        int k = 2;
        int r = 0 , l = 0 , maxLen = 0;
        int n = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        while (r < n) {
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            if (hm.size() > k) {
                char ch2 = s.charAt(l);
                hm.put(ch2, hm.get(ch2)-1);
                if(hm.get(ch2) == 0) hm.remove(ch2);
                l++;
            }
            if(hm.size() <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}