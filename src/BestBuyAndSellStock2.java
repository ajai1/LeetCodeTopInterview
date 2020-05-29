
public class BestBuyAndSellStock2 {
	
	/*Say you have an array prices for which the ith element
	 *  is the price of a given stock on day i.
	 *  Design an algorithm to find the maximum profit. 
	 *  You may complete as many transactions as you like 
	 *  (i.e., buy one and sell one share of the stock multiple times). 
	 */
	
    public static int maxProfit(int[] prices) {
    	
    	if(prices.length == 0)	return 0;
        
    	int buy = prices[0];
    	int sell = 0;
    	int currentProfit = 0;
    	int maxProfit = 0;
    	
    	for(int i = 1; i<prices.length; i++) {
    		if(prices[i] > buy && prices[i] > sell) {
    			sell = Math.max(prices[i], sell);
    			currentProfit = sell - buy;
    		}else {
    			buy = prices[i];
    			sell = 0;
    			maxProfit += currentProfit;
    			currentProfit = 0;
    		}
    	}
    	maxProfit += currentProfit;
    	
    	return maxProfit;
    }

	public static void main(String[] args) {
		//int[] prices = {7,1,5,3,6,4};
		//int[] prices = {2,1,7,1,2,5,3,4};
		int[] prices = {1,2,3,4,5};
		System.out.println(maxProfit(prices));

	}

}
