public class LongComSubseq {
     
    //recursion
     public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);

            return Math.max(ans1, ans2);
        }
     }
     
     //memoization
     public static int lcs2(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        } 
        if(dp[n][m] != -1) return dp[n][m];
        
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = lcs2(str1, str2, n-1, m-1,dp)+1;
        }else{
            int ans1 = lcs2(str1, str2, n-1, m,dp);
            int ans2 = lcs2(str1, str2, n, m-1,dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
     }

     public static int lcs3(String text1,String text2){
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=1 ; i<n+1 ; i++){
            for(int j=1 ; j<m+1 ; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
     }
    public static void main(String args[]){
        String str1 = "abcde";
        String str2 = "ace";
        // System.out.println(lcs(str1, str2, str1.length(), str2.length()));
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0 ; i<n+1 ; i++){
            for(int j=0 ; j<m+1 ; j++){
                dp[i][j] = -1;
            }
        }
        // System.out.println(lcs2(str1, str2, n, m, dp));
        System.out.println(lcs3(str1, str2));

    }
}
