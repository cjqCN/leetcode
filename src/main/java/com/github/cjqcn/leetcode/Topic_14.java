package com.github.cjqcn.leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic_14 {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }
            int preFixMaxIndex = 0;
            tag:
            while (true) {
                for (int i = 1; i < strs.length; i++) {
                    if (strs[0].length() <= preFixMaxIndex || strs[i].length() <= preFixMaxIndex) {
                        break tag;
                    }
                    if (strs[0].charAt(preFixMaxIndex) != strs[i].charAt(preFixMaxIndex)) {
                        break tag;
                    }
                }
                preFixMaxIndex++;
            }
            return strs[0].substring(0, preFixMaxIndex);
        }
    }
}
