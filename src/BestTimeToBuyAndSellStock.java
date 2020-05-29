
public class BestTimeToBuyAndSellStock {
	
    public static int maxProfit(int[] prices) {
    	int sell = 0;
    	int profit = 0;
    	if(prices.length <= 0) {
    		return profit;
    	}
    	int buy = prices[0];
    	for(int i = 1; i<prices.length ; i++) {
    		if(prices[i] > buy) {
    			sell = prices[i];
    			if(sell - buy > profit) {
    				profit = sell - buy;	
    			}    			
    		}else {
    			buy = prices[i];
    		}
    	
    	}
        if(profit <= 0){
            return 0;
        }
    	return profit;
    }

	public static void main(String[] args) {
		//int[] p = {2,1,2,1,0,1,2};
		int[] p = {2,4,3};
		System.out.println(maxProfit(p));

	}

}
