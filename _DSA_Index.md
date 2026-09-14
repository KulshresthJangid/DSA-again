# DSA Progress Tracker

> One file to rule them all. Log every problem here, then link to the note.

See [`LEARNING_GUIDE.md`](LEARNING_GUIDE.md) for the stage-by-stage order to
work through this list, and [`AGENTS.md`](AGENTS.md) for how the AI coach
should run each problem (hints only, brute force → optimize, branch → PR in
`playground/`).

---

## Stats

| Total Solved | Easy | Medium | Hard |
|---|---|---|---|
| 0 / 75 | 0 / 23 | 0 / 43 | 0 / 9 |

---

## Pattern Map (Learn these, recognize problems instantly)

| Pattern | Problems |
|---|---|
| Hash Map / Set | Two Sum, Contains Duplicate, Group Anagrams, Longest Consecutive |
| Two Pointers | 3Sum, Container With Most Water, Valid Palindrome, Remove Nth Node |
| Sliding Window | Longest Substring, Longest Repeating, Min Window Substring |
| Binary Search | Find Min Rotated, Search Rotated |
| DFS / BFS Grid | Number of Islands, Pacific Atlantic, Word Search |
| DFS Tree | Max Depth, Same Tree, Invert Tree, Validate BST, Max Path Sum |
| BFS Tree | Level Order Traversal |
| DP 1D | Climbing Stairs, House Robber, Coin Change, Jump Game, Decode Ways |
| DP 2D | LCS, Unique Paths |
| Monotonic Stack | Daily Temperatures, Car Fleet, Largest Rectangle |
| Two Heaps | Find Median from Stream |
| Topological Sort | Course Schedule, Alien Dictionary |
| Bit Manipulation | Number of 1 Bits, Counting Bits, Missing Number, Sum of Two Integers |

---

## All 75 Problems

> `*(Premium)*` next to a LeetCode link means that problem is locked behind
> LeetCode Premium. Solve it here from the note + hints either way — if you
> don't have Premium, skip pasting that one back into LeetCode and move on.

### Arrays
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 1 | [[1. Two Sum\|Two Sum]] | [LC 1](https://leetcode.com/problems/two-sum/) | Easy | |
| 2 | [[2. Best Time to Buy and Sell Stock\|Best Time to Buy & Sell Stock]] | [LC 121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | |
| 3 | [[3. Contains Duplicate\|Contains Duplicate]] | [LC 217](https://leetcode.com/problems/contains-duplicate/) | Easy | |
| 4 | [[4. Product of Array Except Self\|Product of Array Except Self]] | [LC 238](https://leetcode.com/problems/product-of-array-except-self/) | Medium | |
| 5 | [[5. Maximum Subarray\|Maximum Subarray]] | [LC 53](https://leetcode.com/problems/maximum-subarray/) | Medium | |
| 6 | [[6. Maximum Product Subarray\|Maximum Product Subarray]] | [LC 152](https://leetcode.com/problems/maximum-product-subarray/) | Medium | |
| 7 | [[7. Find Minimum in Rotated Sorted Array\|Find Min in Rotated Array]] | [LC 153](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | |
| 8 | [[8. Search in Rotated Sorted Array\|Search in Rotated Array]] | [LC 33](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | |
| 9 | [[9. 3Sum\|3Sum]] | [LC 15](https://leetcode.com/problems/3sum/) | Medium | |
| 10 | [[10. Container With Most Water\|Container With Most Water]] | [LC 11](https://leetcode.com/problems/container-with-most-water/) | Medium | |

### Strings
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 11 | [[11. Valid Anagram\|Valid Anagram]] | [LC 242](https://leetcode.com/problems/valid-anagram/) | Easy | |
| 12 | [[12. Valid Palindrome\|Valid Palindrome]] | [LC 125](https://leetcode.com/problems/valid-palindrome/) | Easy | |
| 13 | [[13. Longest Substring Without Repeating Characters\|Longest Substring No Repeat]] | [LC 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | |
| 14 | [[14. Longest Repeating Character Replacement\|Longest Repeating Char Replacement]] | [LC 424](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | |
| 15 | [[15. Minimum Window Substring\|Minimum Window Substring]] | [LC 76](https://leetcode.com/problems/minimum-window-substring/) | Hard | |
| 16 | [[16. Group Anagrams\|Group Anagrams]] | [LC 49](https://leetcode.com/problems/group-anagrams/) | Medium | |
| 17 | [[17. Valid Parentheses\|Valid Parentheses]] | [LC 20](https://leetcode.com/problems/valid-parentheses/) | Easy | |
| 18 | [[18. Longest Palindromic Substring\|Longest Palindromic Substring]] | [LC 5](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | |
| 19 | [[19. Palindromic Substrings\|Palindromic Substrings]] | [LC 647](https://leetcode.com/problems/palindromic-substrings/) | Medium | |
| 20 | [[20. Encode and Decode Strings\|Encode and Decode Strings]] | [LC 271](https://leetcode.com/problems/encode-and-decode-strings/) *(Premium)* | Medium | |

### Linked List
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 21 | [[21. Reverse Linked List\|Reverse Linked List]] | [LC 206](https://leetcode.com/problems/reverse-linked-list/) | Easy | |
| 22 | [[22. Merge Two Sorted Lists\|Merge Two Sorted Lists]] | [LC 21](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | |
| 23 | [[23. Merge K Sorted Lists\|Merge K Sorted Lists]] | [LC 23](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | |
| 24 | [[24. Remove Nth Node From End\|Remove Nth From End]] | [LC 19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | |
| 25 | [[25. Reorder List\|Reorder List]] | [LC 143](https://leetcode.com/problems/reorder-list/) | Medium | |
| 26 | [[26. Detect Cycle in Linked List\|Linked List Cycle]] | [LC 141](https://leetcode.com/problems/linked-list-cycle/) | Easy | |

### Trees
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 27 | [[27. Maximum Depth of Binary Tree\|Max Depth Binary Tree]] | [LC 104](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | |
| 28 | [[28. Same Tree\|Same Tree]] | [LC 100](https://leetcode.com/problems/same-tree/) | Easy | |
| 29 | [[29. Invert Binary Tree\|Invert Binary Tree]] | [LC 226](https://leetcode.com/problems/invert-binary-tree/) | Easy | |
| 30 | [[30. Binary Tree Level Order Traversal\|Level Order Traversal]] | [LC 102](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | |
| 31 | [[31. Subtree of Another Tree\|Subtree of Another Tree]] | [LC 572](https://leetcode.com/problems/subtree-of-another-tree/) | Easy | |
| 32 | [[32. Lowest Common Ancestor of BST\|LCA of BST]] | [LC 235](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | |
| 33 | [[33. Validate Binary Search Tree\|Validate BST]] | [LC 98](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | |
| 34 | [[34. Kth Smallest Element in BST\|Kth Smallest in BST]] | [LC 230](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | |
| 35 | [[35. Binary Tree Maximum Path Sum\|Binary Tree Max Path Sum]] | [LC 124](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | |
| 36 | [[36. Construct Tree from Preorder and Inorder\|Construct Tree from Traversals]] | [LC 105](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | |
| 37 | [[37. Serialize and Deserialize Binary Tree\|Serialize & Deserialize Tree]] | [LC 297](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | |

### Graphs
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 38 | [[38. Number of Islands\|Number of Islands]] | [LC 200](https://leetcode.com/problems/number-of-islands/) | Medium | |
| 39 | [[39. Clone Graph\|Clone Graph]] | [LC 133](https://leetcode.com/problems/clone-graph/) | Medium | |
| 40 | [[40. Course Schedule\|Course Schedule]] | [LC 207](https://leetcode.com/problems/course-schedule/) | Medium | |
| 41 | [[41. Pacific Atlantic Water Flow\|Pacific Atlantic Water Flow]] | [LC 417](https://leetcode.com/problems/pacific-atlantic-water-flow/) | Medium | |
| 42 | [[42. Longest Consecutive Sequence\|Longest Consecutive Sequence]] | [LC 128](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | |
| 43 | [[43. Alien Dictionary\|Alien Dictionary]] | [LC 269](https://leetcode.com/problems/alien-dictionary/) *(Premium)* | Hard | |

### Dynamic Programming
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 44 | [[44. Climbing Stairs\|Climbing Stairs]] | [LC 70](https://leetcode.com/problems/climbing-stairs/) | Easy | |
| 45 | [[45. House Robber\|House Robber]] | [LC 198](https://leetcode.com/problems/house-robber/) | Medium | |
| 46 | [[46. House Robber II\|House Robber II]] | [LC 213](https://leetcode.com/problems/house-robber-ii/) | Medium | |
| 47 | [[47. Coin Change\|Coin Change]] | [LC 322](https://leetcode.com/problems/coin-change/) | Medium | |
| 48 | [[48. Longest Increasing Subsequence\|Longest Increasing Subsequence]] | [LC 300](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | |
| 49 | [[49. Longest Common Subsequence\|Longest Common Subsequence]] | [LC 1143](https://leetcode.com/problems/longest-common-subsequence/) | Medium | |
| 50 | [[50. Word Break\|Word Break]] | [LC 139](https://leetcode.com/problems/word-break/) | Medium | |
| 51 | [[51. Combination Sum IV\|Combination Sum IV]] | [LC 377](https://leetcode.com/problems/combination-sum-iv/) | Medium | |
| 52 | [[52. Decode Ways\|Decode Ways]] | [LC 91](https://leetcode.com/problems/decode-ways/) | Medium | |
| 53 | [[53. Unique Paths\|Unique Paths]] | [LC 62](https://leetcode.com/problems/unique-paths/) | Medium | |
| 54 | [[54. Jump Game\|Jump Game]] | [LC 55](https://leetcode.com/problems/jump-game/) | Medium | |

### Intervals
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 55 | [[55. Meeting Rooms\|Meeting Rooms]] | [LC 252](https://leetcode.com/problems/meeting-rooms/) *(Premium)* | Easy | |
| 56 | [[56. Meeting Rooms II\|Meeting Rooms II]] | [LC 253](https://leetcode.com/problems/meeting-rooms-ii/) *(Premium)* | Medium | |
| 57 | [[57. Merge Intervals\|Merge Intervals]] | [LC 56](https://leetcode.com/problems/merge-intervals/) | Medium | |
| 58 | [[58. Insert Interval\|Insert Interval]] | [LC 57](https://leetcode.com/problems/insert-interval/) | Medium | |
| 59 | [[59. Non-overlapping Intervals\|Non-overlapping Intervals]] | [LC 435](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | |

### Matrix
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 60 | [[60. Set Matrix Zeroes\|Set Matrix Zeroes]] | [LC 73](https://leetcode.com/problems/set-matrix-zeroes/) | Medium | |
| 61 | [[61. Spiral Matrix\|Spiral Matrix]] | [LC 54](https://leetcode.com/problems/spiral-matrix/) | Medium | |
| 62 | [[62. Rotate Image\|Rotate Image]] | [LC 48](https://leetcode.com/problems/rotate-image/) | Medium | |
| 63 | [[63. Word Search\|Word Search]] | [LC 79](https://leetcode.com/problems/word-search/) | Medium | |

### Heap
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 64 | [[64. Top K Frequent Elements\|Top K Frequent Elements]] | [LC 347](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | |
| 65 | [[65. Find Median from Data Stream\|Find Median from Data Stream]] | [LC 295](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | |
| 66 | [[66. Kth Largest Element in Array\|Kth Largest Element]] | [LC 215](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | |

### Binary / Bit Manipulation
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 67 | [[67. Number of 1 Bits\|Number of 1 Bits]] | [LC 191](https://leetcode.com/problems/number-of-1-bits/) | Easy | |
| 68 | [[68. Counting Bits\|Counting Bits]] | [LC 338](https://leetcode.com/problems/counting-bits/) | Easy | |
| 69 | [[69. Reverse Bits\|Reverse Bits]] | [LC 190](https://leetcode.com/problems/reverse-bits/) | Easy | |
| 70 | [[70. Missing Number\|Missing Number]] | [LC 268](https://leetcode.com/problems/missing-number/) | Easy | |
| 71 | [[71. Sum of Two Integers\|Sum of Two Integers]] | [LC 371](https://leetcode.com/problems/sum-of-two-integers/) | Medium | |

### Stack & Queue
| # | Problem | LeetCode | Difficulty | Status |
|---|---|---|---|---|
| 72 | [[72. Min Stack\|Min Stack]] | [LC 155](https://leetcode.com/problems/min-stack/) | Medium | |
| 73 | [[73. Daily Temperatures\|Daily Temperatures]] | [LC 739](https://leetcode.com/problems/daily-temperatures/) | Medium | |
| 74 | [[74. Car Fleet\|Car Fleet]] | [LC 853](https://leetcode.com/problems/car-fleet/) | Medium | |
| 75 | [[75. Largest Rectangle in Histogram\|Largest Rectangle in Histogram]] | [LC 84](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | |

---

## Revisit Queue

Problems you want to redo without notes:

-

---

## Patterns I've Internalized

-
