package org.example;

public class RemoveElement {
    public static void removeElement(int[] nums, int val) {

        int j=0;
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i] != val)
                nums[j++] = nums[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] sam = {11, 1154, 454, 34, 546, 33, 22, 22};
        removeElement(sam, 34);
    }
}
