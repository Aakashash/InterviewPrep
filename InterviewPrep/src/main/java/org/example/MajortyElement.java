package org.example;

import java.util.Arrays;

public class MajortyElement {

    // my logic
    public static int majorityElement(int[] nums) {
        int count=1;
        int value=0;
        int j=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                count++;
            else if(count > value)
            {
                value = count;
                j=nums[i];
                count=1;
            }
            else
                count=1;
        }
        if(count > value)
        {
            value = count;
            count=1;
            j=nums[nums.length-1];
        }

        return j;
    }
    public  static  int moorevotingalgo(int [] nums){

        int count=0;
        int element= 0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0)
            {
                count=1;
                element = nums[i];
            }
            else  if(nums[i]==element)
                count++;
            else
                count--;
        }
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if(element==nums[i])
                c++;
        }

        if(c> nums.length/2)
             return element;

        return -1;
    }

    public static void main(String[] args) {
        int [] a = {1,3,5,77,88,99,0,0,0,0,0,0,0};
        int [] b = {90,22,44,54,67,89,90,90,90,90,90,90};

        System.out.println(majorityElement(b));

        System.out.println(moorevotingalgo(b));

    }
}
