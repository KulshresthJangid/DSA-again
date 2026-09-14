// 28. FInd the idnex of the first occurrence in a String
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        
    }

    public int strStr(String haystack, String needle) {
        // we can do it via sliding window technique
        if(haystack.length() < needle.length()) {
            return -1;
        }
        int startIndex = 0;
        int endIndex = needle.length();
        while(endIndex<=haystack.length()) {
            String subString = haystack.substring(startIndex, endIndex);
            if(subString.equals(needle)) {
                return startIndex;
            } else {
                startIndex++;
                endIndex++;
            }
        }

        return -1;
    }
}