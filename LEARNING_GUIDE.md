# DSA Learning Guide — Roadmap to Mastery

Ordered curriculum for the 75 problems in [`_DSA_Index.md`](_DSA_Index.md).
Patterns build on each other, so do the **first pass in this order**. Once
every stage has been through the full loop once, do a second, randomized,
timed pass (see "After all 75" below) — that's where it actually sticks.

For the per-problem workflow (Learn → Solve → Get stuck → Hint → Solve →
Brute Force → Review → Optimize → Re-solve → Repeat) and the git/PR
mechanics, see [`AGENTS.md`](AGENTS.md). This file only answers "what's next
and why."

---

## Stage 1 — Hash Map & Array Fundamentals · Arrays 1–10
**Core idea:** trade space for time by remembering what you've seen (hash
map/set); know when two pointers beats a nested loop.

1. Two Sum — hash map lookup
2. Best Time to Buy and Sell Stock — single-pass min tracking
3. Contains Duplicate — set membership
4. Product of Array Except Self — prefix/suffix products
5. Maximum Subarray — Kadane's algorithm
6. Maximum Product Subarray — Kadane variant, tracking sign flips
7. Find Minimum in Rotated Sorted Array — binary search on rotated array
8. Search in Rotated Sorted Array — binary search variant
9. 3Sum — sort + two pointers
10. Container With Most Water — two pointers, greedy shrink

**Checkpoint:** explain, without notes, when to reach for a hash map vs. two
pointers vs. Kadane's.

## Stage 2 — Strings & Sliding Window · Strings 11–20
**Core idea:** sliding window for substring problems; frequency counting via
arrays/maps; stacks for nested/matching structure.

11. Valid Anagram
12. Valid Palindrome
13. Longest Substring Without Repeating Characters — sliding window
14. Longest Repeating Character Replacement — sliding window + frequency count
15. Minimum Window Substring — sliding window, hard variant
16. Group Anagrams — hash map keyed by sorted string / char count
17. Valid Parentheses — stack
18. Longest Palindromic Substring — expand around center
19. Palindromic Substrings — expand around center, counting
20. Encode and Decode Strings — length-prefix encoding

**Checkpoint:** recite the sliding-window "shrink while invalid, expand while
valid" template from memory.

## Stage 3 — Linked Lists · LinkedList 21–26
**Core idea:** pointer surgery, fast/slow pointers, dummy nodes to avoid
edge-case branching.

21. Reverse Linked List
22. Merge Two Sorted Lists
23. Merge K Sorted Lists — heap or divide & conquer
24. Remove Nth Node From End — fast/slow pointers
25. Reorder List — find middle + reverse second half + merge
26. Detect Cycle in Linked List — Floyd's cycle detection

## Stage 4 — Trees · Trees 27–37
**Core idea:** recursion first, iterative-with-stack/queue only when needed.
BFS = queue = level order. DFS = recursion/stack = depth-first properties.

27. Maximum Depth of Binary Tree
28. Same Tree
29. Invert Binary Tree
30. Binary Tree Level Order Traversal — BFS
31. Subtree of Another Tree
32. Lowest Common Ancestor of BST
33. Validate Binary Search Tree
34. Kth Smallest Element in BST — inorder traversal
35. Binary Tree Maximum Path Sum — post-order DFS with a running global max
36. Construct Tree from Preorder and Inorder
37. Serialize and Deserialize Binary Tree

**Checkpoint:** for any new tree problem, decide "what does each node need
*from* its children" (post-order) vs. "what does each node need to pass
*down*" (pre-order) before writing a line of code.

## Stage 5 — Graphs · Graphs 38–43
**Core idea:** a grid is an implicit graph; DFS/BFS flood fill; topological
sort for ordering/dependency problems.

38. Number of Islands — DFS/BFS flood fill
39. Clone Graph — DFS/BFS + hash map of visited → clone
40. Course Schedule — topological sort / cycle detection
41. Pacific Atlantic Water Flow — multi-source BFS/DFS
42. Longest Consecutive Sequence — hash set
43. Alien Dictionary — topological sort on characters

## Stage 6 — Dynamic Programming · DynamicProgramming 44–54
**Core idea:** state the subproblem in words first ("`f(i)` = ..."), find the
recurrence, *then* code — top-down memo before bottom-up table. This is the
make-or-break stage; don't rush it.

44. Climbing Stairs — 1D DP, Fibonacci shape
45. House Robber — 1D DP with a skip constraint
46. House Robber II — circular-array variant
47. Coin Change — unbounded knapsack shape
48. Longest Increasing Subsequence — 1D DP / binary search
49. Longest Common Subsequence — 2D DP
50. Word Break — 1D DP with dictionary lookup
51. Combination Sum IV — DP counting
52. Decode Ways — 1D DP with lookback
53. Unique Paths — 2D DP over a grid
54. Jump Game — greedy or DP

**Checkpoint:** state the recurrence for each of the above from memory,
no notes.

## Stage 7 — Intervals · Intervals 55–59
**Core idea:** sort by start (or end), then sweep once.

55. Meeting Rooms
56. Meeting Rooms II — min-heap of end times
57. Merge Intervals
58. Insert Interval
59. Non-overlapping Intervals — greedy

## Stage 8 — Matrix · Matrix 60–63
**Core idea:** careful index arithmetic, in-place tricks, explicit boundary
tracking.

60. Set Matrix Zeroes
61. Spiral Matrix
62. Rotate Image
63. Word Search — backtracking DFS on a grid

## Stage 9 — Heap · Heap 64–66
**Core idea:** "top/bottom K" or "running median" → reach for a heap.

64. Top K Frequent Elements
65. Find Median from Data Stream — two heaps
66. Kth Largest Element in Array — heap or quickselect

## Stage 10 — Bit Manipulation · Binary 67–71
**Core idea:** a small, fixed set of XOR/shift tricks — know them cold.

67. Number of 1 Bits
68. Counting Bits — DP + bit trick
69. Reverse Bits
70. Missing Number — XOR or sum trick
71. Sum of Two Integers — bitwise addition, no `+`

## Stage 11 — Stack & Monotonic Stack · Stack-Queue 72–75
**Core idea:** need "next greater/smaller"? A monotonic stack beats a nested
loop.

72. Min Stack
73. Daily Temperatures — monotonic stack
74. Car Fleet — monotonic stack / sorting by position
75. Largest Rectangle in Histogram — monotonic stack, hard

---

## After all 75

- **Second pass, blank slate:** re-solve every problem in a fresh file, no
  notes, timed. Anything that takes noticeably longer than it should goes in
  the Revisit Queue in `_DSA_Index.md`.
- **Mixed random-order drilling** once every pattern above has been
  internalized at least once — real interviews don't announce the pattern.
