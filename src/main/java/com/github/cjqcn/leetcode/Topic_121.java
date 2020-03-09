package com.github.cjqcn.leetcode;

public class Topic_121 {

    class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 1) {
                return 0;
            }
            int res = 0;
            int temp;
            for (int i = 0, j = i + 1; i < prices.length && j < prices.length; ) {
                temp = prices[j] - prices[i];
                if (temp <= 0) {
                    i = j;
                    j++;
                } else {
                    j++;
                    res = Math.max(res, temp);
                }

            }
            return res;
        }
    }
}
