package com.github.cjqcn.leetcode;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic_3 {

    /**
     * 解题思路：
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
            if (s.length() == 1) {
                return 1;
            }
            char[] chs = s.toCharArray();
            int res = 0;
            int start = 0;
            int end = 0;
            for (int i = 0; i < chs.length; i++, end++) {
                for (int j = start; j < end; j++) {
                    if (chs[end] == chs[j]) {
                        start = j + 1;
                    }
                }
                res = Math.max(res, end - start + 1);
            }
            return res;
        }
    }
}
