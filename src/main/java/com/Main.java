package com;

import java.util.Arrays;

public class Main {

    static int[] nums1 = {1, 2, 6, 7};
    static int[] nums2 = {3, 4, 5, 8, 9, 10};



    public static void main(String[] args) {

        System.out.println("The median number for the data set is: " + median(nums1, nums2));
    }
    public static double median(int[] nums1, int[] nums2){

        int nums1Position = 0;
        int nums2Position = 0;
        int mergedPosition = 0;

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] merged = new int[nums1Length + nums2Length];

        double median = 0;

        while (nums1Position < nums1Length && nums2Position < nums2Length) {
            if (nums1[nums1Position] < nums2[nums2Position]) {
                merged[mergedPosition++] = nums1[nums1Position++];
            } else {
                merged[mergedPosition++] = nums2[nums2Position++];
            }
        }
        while (nums1Position < nums1Length) {
            merged[mergedPosition++] = nums1[nums1Position++];
        }
        while (nums2Position < nums2Length) {
            merged[mergedPosition++] = nums2[nums2Position++];
        }
        if (merged.length %2 ==0){
            median = ((double)merged[merged.length/2] + (double)merged[merged.length/2 -1])/2;
        } else {
            median = (double)merged[merged.length/2];
        }

        return median;
    }

}
