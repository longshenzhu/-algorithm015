class Solution {
    //贪心
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]> prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

    //递归
    // private void recursion(int[] prices, int start, int curProfit, int curStock) {
    //     if(start == prices.length){
    //         if(curProfit > maxProfit)maxProfit = curProfit;
    //         return;
    //     }
    //     for (int i = start; i < prices.length; i++) {
    //         //curProfit > 0 待卖出状态
    //         if(curStock > 0){
    //             recursion(prices, i + 1, curProfit + (prices[i] - curStock), 0);
    //         }
    //         //curProfit = 0 待买入状态
    //         else if(curStock == 0){
    //             recursion(prices, i + 1, curProfit, prices[i]);
    //         }
    //     }   
        
    // }
 
}