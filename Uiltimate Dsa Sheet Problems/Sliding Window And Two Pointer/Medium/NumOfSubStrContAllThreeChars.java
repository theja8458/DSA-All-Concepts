import java.util.*;
class NumOfSubStrContAllThreeChars{
    public static void main(String[] args) {
        
        String str = "abcabc";
        int n = str.length();
        int cnt = 0;
        // for(int i=0 ; i<n ; i++){
        //     int hashArr[] = new int[3];
        //     for(int j =i ; j<n ; j++){
        //         char ch = str.charAt(j);
        //         hashArr[ch-'a'] = 1;
        //        if(hashArr[0]+hashArr[1]+hashArr[2] == 3){
        //         cnt += n-j;
        //         break;
        //        }
        //     }
        // }
        // System.out.println("Answer : "+cnt);

        int lastSeen[] = new int[3];
        Arrays.fill(lastSeen, -1);
        for(int i=0 ; i<n ; i++){
            lastSeen[str.charAt(i)-'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                cnt = cnt +Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]))+1;
            }
        }
        System.out.println("Answer : "+cnt);
    }
}