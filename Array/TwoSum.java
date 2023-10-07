package LeetCodeInterviewQuestions.Array;

import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

    }

    private static int[] twoSum(int[] nums, int target) {
       
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(numToIndex.containsKey(target - nums[i])){
                return new int[]{numToIndex.get(target - nums[i]), i};
            }else{
                numToIndex.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException();
    }
}
