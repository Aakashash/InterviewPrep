package org.example;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void removedups(int[] arr, int n) {

        int j = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] sam = {11, 1154, 454, 34, 546, 33, 22, 22};
        removedups(sam, sam.length);

    }
}
