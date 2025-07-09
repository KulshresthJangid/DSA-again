// PROBLEM: 1498: NUmber of Subs Sequences that Satisfies Given Sum conditions

import java.util.Arrays;

public class NumberOfSubSequencesThatSatisfiesGivenSumCondition {
    public static void main(String[] args) {
        // int[] nums = {3,5,6,7};
        int[] nums = {2,3,3,4,6,7};
        Arrays.sort(nums);
        int target = 12;
        int left = 0, right = nums.length -1;
        int result = 0;
        while(left<=right) {
            int sum = nums[left] + nums[right];

            if(sum <= target) {
                result = (int) (result + Math.pow(2,right - left));
                left++;
            } else {
                right--;
            }
        }
        System.out.println(result);
    }
}