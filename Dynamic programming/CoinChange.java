 public class CoinChange {
    
    public static void print(int dp[][]){
        for(int i=0 ; i<dp.length ; i++){
            for(int j=0 ; j<dp[0].length ; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int NoOfWays(int coins[],int sum){
        int n = coins.length;
        int dp[][]= new int[n+1][sum+1];
        for(int i=0 ; i<dp.length ; i++){
            dp[i][0] = 1;
        }

        for(int j=1 ; j<dp[0].length ; j++){
            dp[0][j] = 0;
        }
        for(int i=1 ; i<n+1 ; i++){
            for(int j=1 ; j<sum+1 ; j++){
                if(coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void main(String args[]){
        int coins[]={11 ,6 ,4 ,19 ,7 ,10 ,17 ,5 ,9 ,3, 8 ,14 ,2};
        int sum=14;
        System.out.println(NoOfWays(coins,sum));
    }
}
