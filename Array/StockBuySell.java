public class StockBuySell {
    public static int stocks(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice; //today profit
                maxProfit=Math.max(maxProfit,profit); //total profit
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4}; 
        // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


        // int price[]={7,6,4,3,1}; 
        //In this case, no transactions are done and the max profit = 0
        
        System.out.println(stocks(price));
    }
}