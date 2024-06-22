package org.example;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int temp =0;

        if(k>nums.length && nums.length>100)
            k = nums.length%k;

        while(k>0)
        {
            temp = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--)
            {
                nums[i] = nums[i-1];
            }
            nums[0]=temp;
            k--;
        }

        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] b = {1,2};

        rotate(b,3);

    }
}
