package org.example;

public class MergeSortedArray {

    public  static  void  merge(int[] nums1, int m, int[] nums2, int n ) {
        int j = n-1;
        int i = m-1;
        int k = m+n-1;
        while (j >= 0) {
            if (nums1[i] > nums2[j] && i >= 0) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
    public static void main(String[] args) {

        int [] a = {1,3,5,77,88,99,0,0,0,0,0,0,0};
        int [] b = {2,22,44,54,67,89,90};

        merge(a, 6, b, b.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
