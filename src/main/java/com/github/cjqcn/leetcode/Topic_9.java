package com.github.cjqcn.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic_9 {

    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            if (x < 10) {
                return true;
            }
            if (x % 10 == 0) {
                return false;
            }
            int t = x;
            int tt = 0;
            while(t > 0) {
                tt = tt * 10 + (t % 10);
                t /=10;
            }
            return tt == x;
        }
    }
}
