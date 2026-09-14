package dsa.arrays.p01_two_sum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * BruteForce was skipped (optional) — the first attempt already landed on
 * the optimal approach. See Optimized.java and AGENTS.md's "Exception:
 * their first attempt is already optimal". Only Optimized is gated here;
 * un-@Disable the BruteForce tests if you come back and implement it.
 */
class TwoSumTest {

    @Test
    void optimized_givenExample() {
        assertArrayEquals(new int[] {0, 1}, Optimized.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void optimized_answerNotAtStart() {
        assertArrayEquals(new int[] {1, 2}, Optimized.twoSum(new int[] {3, 2, 4}, 6));
    }

    @Test
    void optimized_duplicateValues() {
        assertArrayEquals(new int[] {0, 1}, Optimized.twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void optimized_negativeNumbers() {
        assertArrayEquals(new int[] {0, 1}, Optimized.twoSum(new int[] {-3, 4, 3, 90}, 1));
    }

    @Disabled("BruteForce implementation skipped — optional, see class comment")
    @Test
    void bruteForce_givenExample() {
        assertArrayEquals(new int[] {0, 1}, BruteForce.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}
