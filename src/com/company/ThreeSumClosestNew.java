package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosestNew {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> values = new ArrayList<>();

        for(int i = 0; i <nums.length-2; i++){
            int j = i + 1;
            int k = j + 1;
            values.add(nums[i]+nums[j]+nums[k]);
        }
        return Collections.min(values, (a, b) -> Integer.compare(Math.abs(target - a), Math.abs(target - b)));
    }
    public static void main(String[] args) {
        ThreeSumClosest solution = new ThreeSumClosest();
        int[] nums = {0,0,0};
        int target = 1;
        int closestSum = solution.threeSumClosest(nums, target);
        System.out.println("Closest 3Sum to target " + target + ": " + closestSum);
    }
}
