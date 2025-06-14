public class LonRepCharRepl {
    public static void main(String[] args) {
        int l = 0 , r = 0 , maxLen = 0 , maxf = 0;
        int hashArr[] = new int[26];
        int k = 2;
        String s = "AABABBA";
        int n = s.length();
        while (r < n) {
            hashArr[s.charAt(r)-'A']++;
            maxf = Math.max(maxf, hashArr[s.charAt(r)-'A']);
            if ((r-l+1)-maxf > k) {
                 hashArr[s.charAt(l)-'A']--;
                 maxf = 0;
                 
                 l++;
            }
            if((r-l+1)- maxf <= 2){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
