package Leetcode.Arrays.Easy;

import java.util.Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit2(arr));

    }

    // brute force 2 loops
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > maxProfit) maxProfit = diff;
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int maxProfit = 0, i = 0, currentProfit = 0, price = prices[0];
        while (i < prices.length - 1) {
            if (price > prices[i]) {
                price = prices[i];
            }
            currentProfit = prices[i+1] - price;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            i++;
        }

        return maxProfit;
    }
}
