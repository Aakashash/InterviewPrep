package org.example;

//Given an integer array nums sorted in non-decreasing order,
// remove some duplicates in-place such that each unique element appears at most twice.

import java.util.Arrays;

public class RemoveDuplicatesUpto2 {
    public static void removeDuplicates(int[] nums) {

        int j = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && count != 1) {
                nums[j++] = nums[i];
                count++;
            } else if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
                count = 0;
            }

        }
        if (nums[j] != nums[nums.length - 1])
            nums[j++] = nums[nums.length - 1];

        else if (nums[j] == nums[nums.length - 1] && count != 2)
            nums[j++] = nums[nums.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        // this actually should be sorted.
        int[] sam = {11, 12, 22, 34, 54, 56, 55, 55, 78, 88, 88, 90, 91, 91, 91};
        removeDuplicates(sam);
    }


}
