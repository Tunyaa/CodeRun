package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergSort {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());

        String[] line = reader.readLine().split(" ");
        int[] nums = new int[len];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        Sort ob = new Sort();
        ob.sort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static class Sort {

        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        void merge(int arr[], int l, int m, int r) {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            // Create temp arrays
            int L[] = new int[n1];
            int R[] = new int[n2];

            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i) {
                L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; ++j) {
                R[j] = arr[m + 1 + j];
            }

            // Merge the temp arrays
            // Initial indices of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        void sort(int arr[], int l, int r) {
            if (l < r) {

                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }

    }
}
