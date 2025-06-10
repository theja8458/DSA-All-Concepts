public class BuySellPrice {

    public static int BuySellStocks(int prices[]){
        int maxProfit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0 ; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyprice=prices[i];
            }
    }
    return maxProfit;
}
    public static void main(String args[]){
        int prices[]={100,180,260,310,40,535,695};
        System.out.println("Max profit = "+BuySellStocks(prices));
    }
    
}
