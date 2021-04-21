package com.company;

import java.util.Arrays;

public class LeetCodeMinDiffIn3Moves {
    public static void main(String[] args) {
        System.out.println(minDiff(new int[]{1, 5, 0, 10, 14}));
    }

    public static int minDiff(int[] nums) {
        if (nums.length == 4) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        res = Math.min(res, nums[nums.length - 4] - nums[0]);
        res = Math.min(res, nums[nums.length - 3] - nums[1]);
        res = Math.min(res, nums[nums.length - 2] - nums[2]);
        res = Math.min(res, nums[nums.length - 1] - nums[3]);
        return res;
    }
}
