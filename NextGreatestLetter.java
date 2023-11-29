public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        System.out.println(findNextGreatestLetter(arr, 'a'));
    }

    public static char findNextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end + 1];
    }

    // runtime 0ms approach
    public static char findNextGreatestLetterOptimized(char[] arr, char target) {
        for (char a : arr) {
            if (a > target)
                return a;
        }
        return arr[0];
    }
}
