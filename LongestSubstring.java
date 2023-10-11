import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestSubstring {
    public static void main(String[] args) throws Exception {
        String s = "pwwkew";
        Set<Character> stack = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!stack.contains(s.charAt(right))) {
                stack.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while(stack.contains(s.charAt(right))) {
                    stack.remove(s.charAt(left));
                    left++;
                }
                stack.add(s.charAt(right));
            }
        }
        System.out.println(maxLength);
    }

    public static int slidingWindowTechnique(int[] arr, int k) throws Exception {
        if (k > arr.length) {
            throw new Exception("Invalid value of k: "+ k);
        }
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }

        int window_value = max_sum;
        for (int i = k; i < arr.length; i++) {
            window_value += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_value);
        }
        return max_sum;
    }
}
