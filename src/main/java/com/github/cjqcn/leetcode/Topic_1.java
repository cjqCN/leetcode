package com.github.cjqcn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Topic_1 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                Integer index = map.get(target - nums[i]);
                if (index != null) {
                    return new int[]{index, i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
