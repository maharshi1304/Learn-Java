package github.maharshi1304.Array;

public class BuyAndSellStock {

    public static int buyAndSellstock(int prices[]){
        int buyValue =Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyValue<prices[i]){
                int profit = prices[i] - buyValue; // Profit
                maxProfit = Math.max(profit, maxProfit);
            } else{
                buyValue = prices[i];
            }
        }
           return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellstock(prices));
        }
     }
    

