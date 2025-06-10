import java.util.*;
class LongConsSeq{
    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101,3,2,1,1};
        int n = arr.length;
        // Arrays.sort(arr);
        int longest = 1;
        // int curCnt = 0;
        // int lstSmall = Integer.MIN_VALUE;
        // for(int i=0 ; i<n ; i++){
        //     if(arr[i]-1 == lstSmall){
        //         curCnt+=1;
        //         lstSmall = arr[i];
        //     }
        //     else if (arr[i] != lstSmall){
        //         curCnt = 1;
        //         lstSmall = arr[i];
        //     }
        //     longest = Math.max(longest, curCnt);
        // }
        // System.out.println(longest);

        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            set.add(arr[i]);
        }
        for(int i:set){
            int num = i-1;
            if(!set.contains(num)){
                int x = i;
                int curCnt = 0;
                while(set.contains(x)){
                    curCnt += 1;
                    x += 1;
                }
                longest = Math.max(curCnt, longest);
            }
        }
      System.out.println(longest);

        
    }
}