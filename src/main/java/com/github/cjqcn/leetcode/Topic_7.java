package com.github.cjqcn.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer/submissions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic_7 {

    class Solution {
        public int reverse(int x) {
            if (x == 0) {
                return 0;
            }
            boolean minus = false;
            int t = x;
            if (x < 0) {
                t = -x;
                minus = true;
            }
            int res = 0;
            int tmp = 0;
            int threshold = Integer.MAX_VALUE / 10;
            while (t > 0) {
                tmp = (t % 10);
                // 判断是否溢出
                if (res > threshold
                        || (res == threshold && ((!minus && tmp > 7) || (minus && tmp > 8)))) {
                    return 0;
                }
                res = res * 10 + tmp;
                t /= 10;
            }
            return minus ? -res : res;
        }
    }
}
