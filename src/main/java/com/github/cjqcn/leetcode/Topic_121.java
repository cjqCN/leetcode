package com.github.cjqcn.leetcode;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic_121 {

    /**
     * 解题思路：寻找正收益序列，然后取正收益序列的最大收益值；
     *          如果收益序列收益为否，说明最后该序列的最后一天价格比第一天要低，新的序列从这该序列的最一天算起。
     */
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
