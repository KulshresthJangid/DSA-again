# 01. Two Sum

- Note: `Arrays/1. Two Sum.md`
- LeetCode: https://leetcode.com/problems/two-sum/
- Pattern: Hash Map
- Difficulty: Easy
- Branch: `problem/01-two-sum`

## Brute Force
Skipped (optional) — first attempt already landed on the optimal approach.
Naive reference: nested loop over every pair `(i, j)`.
- Time: O(n^2)
- Space: O(1)

## Optimized
- Idea: one pass, hash map of `{value -> index seen so far}`. For each
  element, check whether its complement (`target - nums[i]`) was already
  seen; if so, that's the pair.
- Time: O(n)
- Space: O(n)

## What clicked
TODO — your words: what made you reach for the hash map immediately instead
of nested loops?
