// 5. Longest palindromic Substring.

/**
 * LongestPalindromicSubstring
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("racecar"));
    }

    public static String longestPalindrome(String s) {
        int longest = 0;
        int start = 0;
        int end = 0;

        for(int i=0;i<s.length();i++) {
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i+1);
            int len = Math.max(oddLength, evenLength);

            if(len > end-start) {
                start = i -(len-1)/2;
                end = i + len/2;
            }

        }
        return s.substring(start, end+1);
    }

    public static int expand(String s, int left, int right) {
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    
}