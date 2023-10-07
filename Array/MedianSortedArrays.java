package LeetCodeInterviewQuestions.Array;

import java.util.*;

public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] numsx = { 1, 3 };
        int[] numsy = { 2 };
        System.out.println(findMedianSortedArrays(numsx, numsy));
        int[] numsa = { 1, 2 };
        int[] numsb = { 3, 4 };
        System.out.println(findMedianSortedArrays(numsa, numsb));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged.add(nums1[i++]);
            } else {
                merged.add(nums2[j++]);
            }
        }
        while (i < nums1.length)
            merged.add(nums1[i++]);
        while (j < nums2.length)
            merged.add(nums2[j++]);

        int mid = merged.size() / 2;
        if (merged.size() % 2 == 0) {
            return (merged.get(mid - 1) + merged.get(mid)) / 2.0;
        } else {
            return merged.get(mid);
        }
    }
}