package dsa.arrays.p01_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum — Optimized
 *
 * LeetCode: https://leetcode.com/problems/two-sum/
 * Note:     "Arrays/1. Two Sum.md" (repo root)
 *
 * Approach:
 *   Single pass with a hash map of {value -> index seen so far}. For each
 *   nums[i], compute the complement (target - nums[i]) and check whether
 *   we've already seen it. If yes, we've found the pair; if no, remember
 *   this value's index and keep going. Each element is visited once and
 *   every lookup/insert into the map is O(1) amortized.
 *
 * Why it's faster than the naive nested-loop approach:
 *   Nested loops recheck every pair (i, j), redoing O(n) work for every
 *   one of the n elements = O(n^2) time, but O(1) extra space. This
 *   approach trades memory for time: it remembers what it has already
 *   seen so it never has to re-scan — one pass, O(n) time, at the cost of
 *   O(n) space for the map.
 *
 * Time:  O(n) — one pass over nums
 * Space: O(n) — the hash map holds up to n entries
 */
public class Optimized {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementIndex = seen.get(complement);
            if (complementIndex != null) {
                return new int[] {complementIndex, i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
