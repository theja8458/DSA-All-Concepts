public class BestTimeBuyAndSell {
    
    public static int solve(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0 ; i<prices.length ; i++){
            if(BuyPrice < prices[i]){
                int profit = prices[i]-BuyPrice;
                max = Math.max(max, profit);
            }else{
                BuyPrice = prices[i];
            }
        }

        return max;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        // int max = 0;
        System.out.println(solve(prices));
    }
    
}
