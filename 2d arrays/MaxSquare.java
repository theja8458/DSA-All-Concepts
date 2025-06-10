import java.util.Arrays;

public class MaxSquare {
    public static void main(String[] args) {
        int form[][]={{0,1,1,0,1}
                     ,{1,1,0,1,0} 
                     ,{0,1,1,1,0}
                     ,{1,1,1,1,0}
                     ,{1,1,1,1,1}
                     ,{0,0,0,0,0}};
        int n =form.length;
        int m = form[0].length;
        int dp[][] = new int[n][m];
        // Arrays.fill(dp,0);

        int max=-1;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(form[i][j] == 0) continue;
                int left=0 , right= 0 , diag=0;
                if(i > 0) left=dp[i-1][j];
                if(j > 0) right = dp[i][j-1];
                if(i > 0 && j> 0) diag = dp[i-1][j-1];
                dp[i][j] = Math.min(left , Math.min(right , diag))+1;
                max = Math.max(max , dp[i][j]);
            }
        }
        System.out.println(max);
    }
}
