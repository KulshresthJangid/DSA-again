// PROBLEM: 1498: NUmber of Subs Sequences that Satisfies Given Sum conditions

import java.util.Arrays;

public class NumberOfSubSequencesThatSatisfiesGivenSumCondition {
    public static void main(String[] args) {
        // int[] nums = {3,5,6,7};
        int[] nums = {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        Arrays.sort(nums);
        int target = 22;
        int left = 0, right = nums.length -1;
        int result = 0;
        while(left<=right) {
            int sum = nums[left] + nums[right];

            if(sum <= target) {
                result += (int) (Math.pow(2,right - left));
                left++;
            } else {
                right--;
            }
        }
        System.out.println(result);
    }
}