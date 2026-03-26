public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int[] nums = { 3, 1 };
        System.out.println(findPivot(nums));
        System.out.println(binarySearch(nums, 1, findPivot(nums), nums.length - 1));
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[mid] <= arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start == -1)
            start = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
