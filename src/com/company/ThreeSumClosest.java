package com.company;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
    public static void main(String[] args) {
        ThreeSumClosest solution = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int closestSum = solution.threeSumClosest(nums, target);
        System.out.println("Closest 3Sum to target " + target + ": " + closestSum);
    }
}
